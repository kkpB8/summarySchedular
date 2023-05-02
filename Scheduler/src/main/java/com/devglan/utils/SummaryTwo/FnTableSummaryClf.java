package com.devglan.utils.SummaryTwo;

import com.devglan.SummaryScheduler;
import com.devglan.tenant.dao.FnTableSummaryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
public class FnTableSummaryClf {

    private final FnTableSummaryTwo fnTableSummaryTwo;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    @Autowired
    public FnTableSummaryClf( FnTableSummaryTwo fnTableSummaryTwo) {
        this.fnTableSummaryTwo = fnTableSummaryTwo;

    }

    public void fn_tbl_summary_clf(String dateBefore){
        try{
            fnTableSummaryTwo.fn_tbl_summary_clf(3," state_id,district_id,block_id ",
                    " and p.state_id=s.state_id and p.district_id=s.district_id and p.block_id=s.block_id ",
                    " state_id,district_id,block_id,state_name,district_name,block_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary clf Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary_clf(2," state_id,district_id ",
                    " and p.state_id=s.state_id and p.district_id=s.district_id ",
                    " state_id,district_id,state_name,district_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary clf Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary_clf(1," state_id ",
                    " and p.state_id=s.state_id ",
                    " state_id,state_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary clf Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
    }
}
