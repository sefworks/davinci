/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2020 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 *
 */

package edp.davinci.data.pojo;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SqlQueryParam {
    private boolean nativeQuery;
    private List<String> groups;
    private List<Aggregator> aggregators;
    private List<Order> orders;
    private List<Filter> filters;
    private List<Param> params;
    private List<String> columns;
    private int limit;
    private int pageNo;
    private int pageSize;
    private String type; // query or distinct
    private boolean isMaintainer; // user is maintainer or not
}