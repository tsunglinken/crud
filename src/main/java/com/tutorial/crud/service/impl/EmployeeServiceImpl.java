package com.tutorial.crud.service.impl;

import com.tutorial.crud.service.IEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 實作員工功能相關商業邏輯
 */
@Transactional(rollbackFor = Exception.class)
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {


}
