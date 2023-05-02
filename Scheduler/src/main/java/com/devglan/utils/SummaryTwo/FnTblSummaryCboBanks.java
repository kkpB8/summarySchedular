package com.devglan.utils.SummaryTwo;


import com.devglan.SummaryScheduler;
import com.devglan.tenant.dao.FnTableSummaryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class FnTblSummaryCboBanks {
    private final FnTableSummaryTwo fnTableSummaryTwo;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    @Autowired
    public FnTblSummaryCboBanks( FnTableSummaryTwo fnTableSummaryTwo) {
        this.fnTableSummaryTwo = fnTableSummaryTwo;

    }
    public void fn_tbl_summary_cbobanks(String dateBefore){
        try{
            fnTableSummaryTwo.fn_tbl_summary_cbobanks(1,dateBefore,
                    " sp.state_id,sp.district_id,sp.block_id,sm.state_name_en,dm.district_name_en,blk.block_name_en,bm.bank_type,CASE WHEN bm.bank_type=1 THEN 'REGIONAL BANK' WHEN bm.bank_type=2 THEN 'NATIONALISED BANK' WHEN bm.bank_type=3 THEN 'COOPERATIVE BANK' ELSE NULL END ",
                    " state_id,district_id,block_id,state_name,district_name,block_name,bank_type_id,bank_type_name ",
                    " where NOT EXISTS (select 1 from tbl_summary_cbobanks s where s.state_id = sp.state_id and s.district_id = sp.district_id and s.block_id=sp.block_id and s.bank_type_id=bm.bank_type ) ",
                    " s.state_id = ab.state_id and s.district_id=ab.district_id and s.block_id=ab.block_id and s.bank_type_id=ab.bank_type ");
        }catch (Exception ex){
            logger.info("Summary Cbo Bank Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary_cbobanks(2,dateBefore,
                    " sp.state_id,sp.district_id,sp.block_id,sm.state_name_en,dm.district_name_en,blk.block_name_en,bm.bank_id,bm.bank_name,bm.bank_type ",
                    " state_id,district_id,block_id,state_name,district_name,block_name,bank_id,bank_name,bank_type_id ",
                    " where NOT EXISTS (select 1 from tbl_summary_cbobanks s where s.state_id = sp.state_id and s.district_id = sp.district_id and s.block_id=sp.block_id and s.bank_id=bm.bank_id and s.bank_type_id=bm.bank_type ) ",
                    " s.state_id = ab.state_id and s.district_id=ab.district_id and s.block_id=ab.block_id and s.bank_id=ab.bank_id ");
        }catch (Exception ex){
            logger.info("Summary Cbo Bank Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
            fnTableSummaryTwo.fn_tbl_summary_cbobanks(3,dateBefore,
                    " sp.state_id,sp.district_id,sp.block_id,sm.state_name_en,dm.district_name_en,blk.block_name_en,bbm.bank_branch_id,bbm.bank_branch_name,bm.bank_id,bm.bank_type ",
                    " state_id,district_id,block_id,state_name,district_name,block_name,branch_id,branch_name,bank_id,bank_type_id ",
                    " where NOT EXISTS (select 1 from tbl_summary_cbobanks s where s.state_id = sp.state_id and s.district_id = sp.district_id and s.block_id=sp.block_id and s.branch_id=bbm.bank_branch_id and s.bank_id=bm.bank_id and s.bank_type_id=bm.bank_type ) ",
                    " s.state_id = ab.state_id and s.district_id=ab.district_id and s.block_id=ab.block_id and s.branch_id=ab.bank_branch_id and s.bank_id=ab.bank_id and s.bank_type_id=ab.bank_type ");
        }catch (Exception ex){
            logger.info("Summary Cbo Bank Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
    }


}
