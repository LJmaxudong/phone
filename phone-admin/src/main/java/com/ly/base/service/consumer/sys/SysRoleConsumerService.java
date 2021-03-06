package com.ly.base.service.consumer.sys;

import com.ly.base.core.model.sys.SysRole;
import com.ly.base.common.model.Json;
import java.util.List;
import com.ly.base.common.model.Model;

/**
 * 日志记录,处理返回结果,缓存特殊数据
 * @author LeiYong
 * @date 2016年10月04日
 */
public interface SysRoleConsumerService {

	/**
	 * 通过主键查询
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json getByPk(Integer pk);
	/**
	 * 通过主键删除
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json deleteByPk(Integer pk);
	/**
	 * 通过主键批量删除
	 * 
	 * @param pks
	 * @return
	 */ 
	public Json deleteByBatch(Integer... pks);
	/**
	 * 通过主键启用
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json enable(String updateBy,Integer pk);
	/**
	 * 通过主键禁用
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json disable(String updateBy,Integer pk);
	/**
	 * 通过主键批量启用
	 * 
	 * @param pks
	 * @return
	 */ 
	public Json enables(String updateBy,Integer... pks);
	/**
	 * 通过主键批量禁用
	 * 
	 * @param pks
	 * @return
	 */ 
	public Json disables(String updateBy,Integer... pks);
	/**
	 * 新增记录
	 * 
	 * @param data
	 * @return
	 */ 
	public Json insert(SysRole data);
	/**
	 * 批量新增
	 * 
	 * @param list
	 * @return
	 */ 
	public Json insertBatch(List<SysRole> list);
	/**
	 * 更新记录
	 * 
	 * @param data
	 * @return
	 */ 
	public Json update(SysRole data);
	/**
	 * 分页查询
	 * 
	 * @param queryInfo
	 * @param pageNum
	 * @param pageSize
	 * @param orderBy
	 * @return
	 */ 
	public Json findByPage(SysRole queryInfo, int pageNum, int pageSize,String orderBy);
	/**
	 * 查询所有
	 * 
	 * @param queryInfo
	 * @param orderBy
	 * @return
	 */ 
	public Json findAll(SysRole queryInfo, String orderBy);
	/**
	 * 分页查询
	 * 
	 * @param conditions
	 * @param pageNum
	 * @param pageSize
	 * @param orderBy
	 * @return
	 */ 
	public Json findByPage(List<Model> conditions, int pageNum, int pageSize, String order);
	/**
	 * 查询所有
	 * 
	 * @param conditions
	 * @param orderBy
	 * @return
	 */ 
	public Json findAll(List<Model> conditions, String orderBy);
	/**
	 * 给角色授权
	 * @param menus
	 * @param pk
	 * @return
	 */
	public Json grantRole(List<String> menus, Integer pk);
}