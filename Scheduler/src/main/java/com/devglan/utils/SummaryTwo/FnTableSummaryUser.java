package com.devglan.utils.SummaryTwo;


import com.devglan.SummaryScheduler;
import com.devglan.tenant.dao.FnTableSummaryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class FnTableSummaryUser {


    private final FnTableSummaryTwo fnTableSummaryTwo;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    @Autowired
    public FnTableSummaryUser(FnTableSummaryTwo fnTableSummaryTwo) {
        this.fnTableSummaryTwo = fnTableSummaryTwo;
    }

    public void fn_tbl_summary_user(String dateBefore ){
        //summary tbl users

        try {
            //1st call
            fnTableSummaryTwo.fn_tbl_summary_user(5, "state_id,district_id,block_id,unnest(string_to_array(village_id,','))village_id",
                    "state_id,district_id,block_id,unnest(string_to_array(village_id,','))", " and p.village_id::int=s.village_id", dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
        }
        //2st call
        try {
            fnTableSummaryTwo.fn_tbl_summary_user(4, "state_id,district_id,block_id,unnest(string_to_array(panchayat_id,','))panchayat_id",
                    "state_id,district_id,block_id,unnest(string_to_array(panchayat_id,','))", " and p.panchayat_id::int=s.panchayat_id", dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 4+" error  : "+ex.getMessage());
        }
        //3st call
        try{
            fnTableSummaryTwo.fn_tbl_summary_user(3,"state_id,district_id,block_id","state_id,district_id,block_id",
                    " and  p.block_id::int=s.block_id",dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
        try {
            //1st call
            fnTableSummaryTwo.fn_tbl_summary_user(2, "state_id,district_id", "state_id,district_id",
                    " and p.district_id::int=s.district_id", dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
            //1st call
            fnTableSummaryTwo.fn_tbl_summary_user(1,"state_id","state_id",
                    " and p.state_id=s.state_id",dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
    }

}
