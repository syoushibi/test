package com.nakamura.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nakamura.bean.Items;
import com.nakamura.mapper.ItemsMapper;
import com.nakamura.service.ItemsService;
import com.nakamura.utils.ItemsUtils;
@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;
	@Override
	public List<Items> findItemsAll() {
		List<Items> items = itemsMapper.findItemsAll();
		return items;
	}
	@Override
	public Items findItemsById(Integer id) {
		Items item = itemsMapper.findItemsById(id);
		return item;
	}
	@Override
	public int updateitem(Items item,MultipartFile pictureFile) {
		Date date = new Date();
		//设置修改的时间
		item.setCreatetime(date);
		//得到上传的图片的名称
		String name = pictureFile.getOriginalFilename();
		//要转换的日期的格式
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		//以正确的格式得到今天的日期
		String time = format.format(date);
		//在up文件夹里面创建一个今天的图片文件（好整理）
		File file = new File("E://up",time);
		//问这个文件夹是否存在  不存在则创建
		if(!file.exists()) {
			file.mkdir();
		}
		try {
			//得到一个永远不会重复的图片名称
			String imageName = ItemsUtils.getImageName(name);
			//拼接路径
			File imageFile = new File(file,imageName);
			//将图片存到图片服务器中
			pictureFile.transferTo(imageFile);
			//存到数据库里
			item.setPic("http://localhost/"+time+"/"+imageName);
			int count = itemsMapper.updateitem(item);
			return count;
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return 0;
	}

}
