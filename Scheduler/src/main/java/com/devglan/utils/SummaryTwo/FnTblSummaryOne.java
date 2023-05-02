package com.devglan.utils.SummaryTwo;

import com.devglan.SummaryScheduler;
import com.devglan.tenant.dao.FnTableSummaryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class FnTblSummaryOne {

    private final FnTableSummaryTwo fnTableSummaryTwo;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    @Autowired
    public FnTblSummaryOne(FnTableSummaryTwo fnTableSummaryTwo) {
        this.fnTableSummaryTwo = fnTableSummaryTwo;
    }


    public void fn_tbl_summary1(String datBefore){
        try{
            fnTableSummaryTwo.fn_tbl_summary1(1," sp.state_id "," ab.state_id=s.state_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary1(2," sp.state_id,sp.district_id "," ab.state_id=s.state_id and ab.district_id=s.district_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary1(3," sp.state_id,sp.district_id,sp.block_id "," ab.state_id=s.state_id and ab.district_id=s.district_id and ab.block_id=s.block_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary1(4," sp.state_id,sp.district_id,sp.block_id,sp.panchayat_id "," ab.state_id=s.state_id and ab.district_id=s.district_id and ab.block_id=s.block_id and ab.panchayat_id = s.panchayat_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 4+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary1(5," sp.state_id,sp.district_id,sp.block_id,sp.panchayat_id,sp.village_id "," ab.state_id=s.state_id and ab.district_id=s.district_id and ab.block_id=s.block_id and ab.panchayat_id = s.panchayat_id and ab.village_id=s.village_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
        }
    }
}
