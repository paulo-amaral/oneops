/*******************************************************************************
 *  
 *   Copyright 2015 Walmart, Inc.
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  
 *******************************************************************************/
package com.oneops.ecv.health;

import java.util.List;

/**
 * Created by glall on 10/29/14.
 */
public class HealthCheckerImpl implements IHealthChecker {

    List<IHealthCheck> healthChecks;

    @Override
    public List<IHealthCheck> getHealthChecksToRun() {
        return healthChecks;
    }

    @Override
    public void setHealthChecksToRun(List<IHealthCheck> healthChecks) {
        this.healthChecks = healthChecks;
    }

}

