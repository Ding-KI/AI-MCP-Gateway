package com.DingKI.ai.mcp.server.test.service;

import com.DingKI.ai.mcp.server.test.model.XxxRequest01;
import com.DingKI.ai.mcp.server.test.model.XxxRequest02;
import com.DingKI.ai.mcp.server.test.model.XxxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class TestService {

    @Tool(description = "get employee info")
    public XxxResponse getCompanyEmployee(XxxRequest01 xxxRequest01, XxxRequest02 xxxRequest02) {
        log.info("inquery work time and salary based on company and title {} {}",xxxRequest01.getCompany(), xxxRequest02.getEmployeeName());

        // 这部分可以实际调用你需要的接口，比如调用http接口获取个数据或者做一些操作等。

        XxxResponse xxxResponse = new XxxResponse();
        xxxResponse.setSalary(new Random().longs(10000).toString());
        xxxResponse.setDayManHour(String.valueOf(new Random().nextInt(24)));

        return xxxResponse;
    }

}

