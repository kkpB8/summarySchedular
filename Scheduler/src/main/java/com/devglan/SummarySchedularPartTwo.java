package com.devglan;

import com.devglan.utils.SummaryTwo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

@Component
public class SummarySchedularPartTwo {

    private final FNTableSummary fnTableSummary;
    private final FnTableSummaryUser fn_tbl_summary_user;
    private final FnTblSummaryOne fn_tbl_summary_one;
    private final FnTableSummaryBank fn_tbl_summary_bank;
    private final FnTblSummaryCboBanks fn_tbl_summary_cbobanks;
    private final FnTableSummaryMem fn_table_summary_mem;
    private final FnTableSummaryVo fn_tbl_summary_vo;
    private final FnTableSummaryClf fnTableSummaryClf;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");




    @Autowired
    public SummarySchedularPartTwo(FNTableSummary fnTableSummary, FnTableSummaryUser fnTblSummaryUser, FnTblSummaryOne fnTblSummaryOne, FnTableSummaryBank fnTblSummaryBank, FnTblSummaryCboBanks fnTblSummaryCbobanks, FnTableSummaryMem fnTableSummaryMem, FnTableSummaryVo fnTblSummaryVo, FnTableSummaryClf fnTableSummaryClf) {
        this.fnTableSummary = fnTableSummary;
        fn_tbl_summary_user = fnTblSummaryUser;
        fn_tbl_summary_one = fnTblSummaryOne;
        fn_tbl_summary_bank = fnTblSummaryBank;
        fn_tbl_summary_cbobanks = fnTblSummaryCbobanks;
        fn_table_summary_mem = fnTableSummaryMem;
        fn_tbl_summary_vo = fnTblSummaryVo;
        this.fnTableSummaryClf = fnTableSummaryClf;
    }

     @Scheduled(cron = "${cron.run.regex}")
    //@Scheduled(initialDelay = 5000,fixedRate = 10000000)
    public void summaryTwo(){
        //scheduler runs at 1AM so scheduler will run for a day before
        Calendar cal  = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String dateBefore = dateFormat.format(new Date(cal.getTimeInMillis()));
        String table_name="dynamic_lokos_ha";
        Date date=new Date();

        //sql-1
        logger.info("Summary Scheduler Start, Date = " +new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date));
        logger.info("Summary  Scheduler Start");
        fnTableSummary.fn_table_summary(dateBefore);
        logger.info("Summary  Scheduler End");

        //sql-2
        logger.info("Summary MEM Scheduler Start");
        fn_table_summary_mem.fn_tbl_summary_mem(dateBefore);
        logger.info("Summary MEM Scheduler End");

        //sql-3
        logger.info("Summary VO Scheduler Start");
        fn_tbl_summary_vo.fn_tbl_summary_vo(dateBefore);
        logger.info("Summary VO Scheduler End");


        //sql-4
        logger.info("Summary clf Scheduler Start");
        fnTableSummaryClf.fn_tbl_summary_clf(dateBefore);
        logger.info("Summary clf Scheduler End");

        //sql-5
        logger.info("Summary User Scheduler Start");
        fn_tbl_summary_user.fn_tbl_summary_user(dateBefore);
        logger.info("Summary User Scheduler End");

        //sql-6
        logger.info("Summary One Scheduler Start");
        fn_tbl_summary_one.fn_tbl_summary1(dateBefore);
        logger.info("Summary One Scheduler Start");


        //sql-7
        logger.info("Summary bank Scheduler Start");
        fn_tbl_summary_bank.fn_tbl_summary_bank(dateBefore);
        logger.info("Summary bank Scheduler End");


        //sql-8
        logger.info("Summary CBO bank Scheduler Start");
        fn_tbl_summary_cbobanks.fn_tbl_summary_cbobanks(dateBefore);
        logger.info("Summary CBO bank Scheduler End");


    }
}
