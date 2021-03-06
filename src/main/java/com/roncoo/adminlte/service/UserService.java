/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.roncoo.adminlte.service;

import com.roncoo.adminlte.bean.Result;
import com.roncoo.adminlte.bean.entity.RcUser;
import com.roncoo.adminlte.util.base.Page;

/**
 * 用户Service
 * 
 * @author LYQ
 *
 */
public interface UserService {

	Result<RcUser> login(String userno, String password);

	Result<Page<RcUser>> listForPage(int pageCurrent, int pageSize, String date, String search);

	Result<RcUser> query(long id);

	Result<RcUser> queryByUserNo(String userno);

	Result<Integer> save(RcUser rcUser);

	Result<Integer> update(RcUser rcUser);

	Result<Integer> delete(long id);

}
