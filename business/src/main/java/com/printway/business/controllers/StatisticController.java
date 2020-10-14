package com.printway.business.controllers;

import com.printway.business.dto.statistic.SummaryStatistic;
import com.printway.business.dto.statistic.SpecificStatistic;
import com.printway.business.services.StatisticService;
import com.printway.common.time.TimeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/statistic")
public class StatisticController {
    @Autowired
    private StatisticService statisticService;

    @GetMapping("")
    public List<SummaryStatistic> statistic(@RequestParam long from,
                                            @RequestParam long to,
                                            @RequestParam(defaultValue = "") Integer storeId) {
        var fromTime = TimeParser.parseEpochMillisToLocalDateTime(from);
        var toTime = TimeParser.parseEpochMillisToLocalDateTime(to);
        return statisticService.statForSummary(fromTime, toTime, storeId);
    }

    @GetMapping("product-type")
    public List<SpecificStatistic> statForProductType(@RequestParam long from,
                                                      @RequestParam long to,
                                                      @RequestParam(defaultValue = "") Integer storeId) {
        var fromTime = TimeParser.parseEpochMillisToLocalDateTime(from);
        var toTime = TimeParser.parseEpochMillisToLocalDateTime(to);
        return statisticService.statForProductType(fromTime, toTime, storeId);
    }

    @GetMapping("product-design")
    public List<SpecificStatistic> statForProductDesign(@RequestParam long from,
                                                        @RequestParam long to,
                                                        @RequestParam(defaultValue = "") Integer storeId) {
        var fromTime = TimeParser.parseEpochMillisToLocalDateTime(from);
        var toTime = TimeParser.parseEpochMillisToLocalDateTime(to);
        return statisticService.statForProductDesign(fromTime, toTime, storeId);
    }

    @GetMapping("seller")
    public List<SpecificStatistic> statForSeller(@RequestParam long from,
                                                 @RequestParam long to,
                                                 @RequestParam(defaultValue = "") Integer storeId) {
        var fromTime = TimeParser.parseEpochMillisToLocalDateTime(from);
        var toTime = TimeParser.parseEpochMillisToLocalDateTime(to);
        return statisticService.statForSeller(fromTime, toTime, storeId);
    }

    @GetMapping("supplier")
    public List<SpecificStatistic> statForSupplier(@RequestParam long from,
                                                   @RequestParam long to,
                                                   @RequestParam(defaultValue = "") Integer storeId) {
        var fromTime = TimeParser.parseEpochMillisToLocalDateTime(from);
        var toTime = TimeParser.parseEpochMillisToLocalDateTime(to);
        return statisticService.statForSupplier(fromTime, toTime, storeId);
    }
}
