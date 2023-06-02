package com.devglan.utils.SummaryTwo;

import com.devglan.SummaryScheduler;
import com.devglan.tenant.dao.FnTableSummaryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class FnTableSummaryBank {
    private final FnTableSummaryTwo fnTableSummaryTwo;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    @Autowired
    public FnTableSummaryBank( FnTableSummaryTwo fnTableSummaryTwo) {
        this.fnTableSummaryTwo = fnTableSummaryTwo;

    }

    public void  fn_tbl_summary_bank(String dateBefore){
        try{
            fnTableSummaryTwo.fn_tbl_summary_bank(1,dateBefore,
                    " sp.state_id , sm.state_name_en  , bm.bank_id , bm.bank_name ,cbd.bank_branch_id ",
                    " geographical_flag,year_month, state_id,state_name,bank_id,bank_name,branch_id ",
                    "  where  NOT EXISTS ( SELECT 1 FROM tbl_summary_banks WHERE geographical_flag = 1 AND state_id = sp.state_id AND bank_id = bm.bank_id AND year_month = to_char(current_date,'YYYY-MM') ) ",
                    " s.state_id=ab.state_id and s.bank_id=ab.bank_id and s.branch_id=ab.bank_branch_id and ab.geographical_flag =1 ");
        }catch (Exception ex){
            logger.info("Summary Bank Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary_bank(2,dateBefore,
                    " sp.state_id , sm.state_name_en ,sp.district_id,dm.district_name_en,bm.bank_id , bm.bank_name,cbd.bank_branch_id,bbm.bank_branch_name ",
                    " geographical_flag,year_month, state_id,state_name,district_id,district_name,bank_id,bank_name,branch_id,branch_name ",
                    " where   NOT EXISTS (SELECT 1 FROM tbl_summary_banks WHERE geographical_flag = 2 AND state_id = sp.state_id AND district_id = sp.district_id AND bank_id = bm.bank_id AND branch_id = cbd.bank_branch_id AND year_month = to_char(current_date,'YYYY-MM')) ",
                    " s.state_id=ab.state_id and s.district_id=ab.district_id and s.bank_id=ab.bank_id and s.branch_id=ab.bank_branch_id ");
        }catch (Exception ex){
            logger.info("Summary Bank Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }

        try{
            fnTableSummaryTwo.fn_tbl_summary_bank(3,dateBefore,
                    " sp.state_id , sm.state_name_en ,sp.district_id,dm.district_name_en,sp.block_id,blk.block_name_en,cbd.bank_id , bm.bank_name,cbd.bank_branch_id,bbm.bank_branch_name ",
                    " geographical_flag,year_month,state_id,state_name,district_id,district_name,block_id,block_name,bank_id,bank_name,branch_id,branch_name ",
                    " where NOT EXISTS (SELECT 1 FROM tbl_summary_banks WHERE geographical_flag = 3 AND state_id = sp.state_id AND district_id = sp.district_id AND bank_id = bm.bank_id AND branch_id = cbd.bank_branch_id AND year_month = to_char(current_date,'YYYY-MM')) ",
                    " s.state_id=ab.state_id and s.district_id=ab.district_id and s.block_id=ab.block_id and s.bank_id=ab.bank_id and s.branch_id=ab.bank_branch_id ");
        }catch (Exception ex){
            logger.info("Summary Bank Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }

    }

}
