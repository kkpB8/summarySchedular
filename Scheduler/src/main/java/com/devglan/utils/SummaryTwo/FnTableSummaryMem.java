package com.devglan.utils.SummaryTwo;


import com.devglan.SummaryScheduler;
import com.devglan.tenant.dao.FnTableSummaryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class FnTableSummaryMem {

    private final FnTableSummaryTwo fnTableSummaryTwo;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    @Autowired
    public FnTableSummaryMem( FnTableSummaryTwo fnTableSummaryTwo) {
        this.fnTableSummaryTwo = fnTableSummaryTwo;

    }


    public void fn_tbl_summary_mem(String dateBefore){

        try{
            fnTableSummaryTwo.fn_tbl_summary_mem(5," state_id,district_id,block_id,panchayat_id,village_id ",
                    " and p.state_id=s.state_id and p.district_id=s.district_id and p.block_id=s.block_id and p.panchayat_id = s.panchayat_id and p.village_id=s.village_id ",
                    " state_id,district_id,block_id,panchayat_id,village_id,state_name ,district_name,block_name,panchayat_name,village_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary mem Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
        }

        try{
            fnTableSummaryTwo.fn_tbl_summary_mem(4," state_id,district_id,block_id,panchayat_id ",
                    " and p.state_id=s.state_id and p.district_id=s.district_id and p.block_id=s.block_id and p.panchayat_id = s.panchayat_id  ",
                    " state_id,district_id,block_id,panchayat_id,state_name  ,district_name,block_name,panchayat_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary mem Scheduler  geo_flag: "+ 4+" error  : "+ex.getMessage());
        }

        try{
            fnTableSummaryTwo.fn_tbl_summary_mem(3," state_id,district_id,block_id ",
                    " and p.state_id=s.state_id and p.district_id=s.district_id and p.block_id=s.block_id  ",
                    " state_id,district_id,block_id,state_name,district_name,block_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary mem Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }

        try{
            fnTableSummaryTwo.fn_tbl_summary_mem(2," state_id,district_id ",
                    " and p.state_id=s.state_id and p.district_id=s.district_id  ",
                    " state_id,district_id,state_name,district_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary mem Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary_mem(1," state_id ",
                    " and p.state_id=s.state_id  ",
                    " state_id,state_name ",
                    dateBefore);
        }catch (Exception ex){
            logger.info("Summary mem Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }

    }


}
