/*
 * Copyright (c) 2010-2020, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package pf4j2.plugin.api;

import org.pf4j.ExtensionPoint;

/*
 * 根接口，继承ExtensionPoint
 * 将该项目打成jar包，放到plugin项目的lib文件夹下，然后构建配置路径
 */
public interface ApiExtensionPoint extends ExtensionPoint {

	String token();
	
}