package com.entity.view;

import com.entity.ChulijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 处理结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
@TableName("chulijieguo")
public class ChulijieguoView  extends ChulijieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChulijieguoView(){
	}
 
 	public ChulijieguoView(ChulijieguoEntity chulijieguoEntity){
 	try {
			BeanUtils.copyProperties(this, chulijieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}