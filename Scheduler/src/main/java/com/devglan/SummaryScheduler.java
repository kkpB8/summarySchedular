package com.devglan;

import com.devglan.tenant.dao.FnTableSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

@Component
public class SummaryScheduler {


    private final FnTableSummary fnTableSummary;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");


    @Autowired
    public SummaryScheduler(FnTableSummary fnTableSummary) {
        this.fnTableSummary = fnTableSummary;
    }

    // @Scheduled(cron = "0 1 * * * ?")
  // @Scheduled(initialDelay = 5000,fixedRate = 100000)
    public void summary_scheduler(){

        //scheduler runs at 1AM so scheduler will run for a day before
        Calendar cal  = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String dateBefore = dateFormat.format(new Date(cal.getTimeInMillis()));
        String table_name="dynamic_lokos_ha";
        Date date=new Date();
       logger.info("Summary Scheduler Start, Date = " +new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date));
            logger.info("Summary  Scheduler Start");

            fn_table_summary(dateBefore);
            logger.info("Summary  Scheduler End");


            logger.info("Summary User Scheduler Start");
            fn_tbl_summary_user(dateBefore);
            logger.info("Summary User Scheduler End");

       logger.info("Summary One Scheduler Start");
       fn_tbl_summary1(dateBefore);
       logger.info("Summary One Scheduler Start");

            logger.info("Summary bank Scheduler Start");
            fn_tbl_summary_bank(dateBefore);
            logger.info("Summary bank Scheduler End");

            logger.info("Summary CBO bank Scheduler Start");
            fn_tbl_summary_cbobanks(dateBefore);
            logger.info("Summary CBO bank Scheduler End");


       logger.info("Summary Scheduler End Date= " +new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date));

    }



    public void fn_table_summary(String dateBefore){
        //5st call
        try {
            fnTableSummary.fn_table_summary(5, "state_id,district_id,block_id,panchayat_id,village_id", " and p.village_id=s.village_id ",
                    "state_id,district_id,block_id,panchayat_id,village_id,state_name ,district_name,block_name,panchayat_name,village_name",
                    dateBefore);
         }catch (Exception ex){
        logger.info("Summary Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
    }
        try{
        //4nd call
        fnTableSummary.fn_table_summary(4,"state_id,district_id,block_id,panchayat_id","  and p.panchayat_id=s.panchayat_id ",
                "state_id,district_id,block_id,panchayat_id,state_name  ,district_name,block_name,panchayat_name",dateBefore);
        }catch (Exception ex){
            logger.info("Summary Scheduler  geo_flag: "+ 4+" error  : "+ex.getMessage());
        }
        try {
            //3st call
            fnTableSummary.fn_table_summary(3, " state_id,district_id,block_id ", " and p.block_id=s.block_id ",
                    " state_id,district_id,block_id,state_name,district_name,block_name ",
                    dateBefore);
        }catch (Exception ex){
        logger.info("Summary Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
    }
        try{
        //2st call
        fnTableSummary.fn_table_summary(2," state_id,district_id "," and p.district_id=s.district_id ",
                " state_id,district_id,state_name,district_name ",
                dateBefore);
        }catch (Exception ex){
            logger.info("Summary Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
        //1st call
        fnTableSummary.fn_table_summary(1," state_id "," and p.state_id=s.state_id ",
                " state_id,state_name ",
                dateBefore);
        }catch (Exception ex){
            logger.info("Summary Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
        }
    }

    public void fn_tbl_summary_user(String dateBefore ){
        //summary tbl users

        try {
            //1st call
            fnTableSummary.fn_tbl_summary_user(5, "state_id,district_id,block_id,unnest(string_to_array(village_id,','))village_id",
                    "state_id,district_id,block_id,unnest(string_to_array(village_id,','))", " and p.village_id::int=s.village_id", dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
        }
        //2st call
        try {
            fnTableSummary.fn_tbl_summary_user(4, "state_id,district_id,block_id,unnest(string_to_array(panchayat_id,','))panchayat_id",
                    "state_id,district_id,block_id,unnest(string_to_array(panchayat_id,','))", " and p.panchayat_id::int=s.panchayat_id", dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 4+" error  : "+ex.getMessage());
        }
        //3st call
        try{
        fnTableSummary.fn_tbl_summary_user(3,"state_id,district_id,block_id","state_id,district_id,block_id",
                " and  p.block_id::int=s.block_id",dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
        try {
            //1st call
            fnTableSummary.fn_tbl_summary_user(2, "state_id,district_id", "state_id,district_id",
                    " and p.district_id::int=s.district_id", dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
        //1st call
        fnTableSummary.fn_tbl_summary_user(1,"state_id","state_id",
                " and p.state_id=s.state_id",dateBefore);
        }catch (Exception ex){
            logger.info("Summary User Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
    }


    public void fn_tbl_summary1(String datBefore){
        try{
        fnTableSummary.fn_tbl_summary1(1," sp.state_id "," s.state_id=ab.state_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary1(2," sp.district_id "," s.district_id=ab.district_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary1(3," sp.block_id "," s.block_id=ab.block_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary1(4," sp.panchayat_id "," s.panchayat_id=ab.panchayat_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 4+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary1(5," sp.village_id "," s.village_id=ab.village_id ",datBefore);
        }catch (Exception ex){
            logger.info("Summary One Scheduler  geo_flag: "+ 5+" error  : "+ex.getMessage());
        }
    }


    public void  fn_tbl_summary_bank(String dateBefore){
        try{
        fnTableSummary.fn_tbl_summary_bank(1,dateBefore," fp.state_id , sm.state_name_en  , cbd.bank_id , bm.bank_name "," state_id,state_name,bank_id,bank_name,shg_bank,vo_bank,clf_bank ",
                "  where fp.is_active=true and sp.is_active=true and fp.activation_status=2 and sp.activation_status=2 AND NOT EXISTS (SELECT 1 FROM tbl_summary_banks WHERE geographical_flag = 1 AND state_id = fp.state_id AND bank_id = cbd.bank_id AND year_month = to_char(current_date,'YYYY-MM')) ",
                " s.state_id=ab.state_id and s.bank_id=ab.bank_id ");
        }catch (Exception ex){
            logger.info("Summary Bank Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary_bank(2,dateBefore," fp.state_id , sm.state_name_en ,fp.district_id,dm.district_name_en,cbd.bank_id , bm.bank_name,cbd.bank_branch_id,bbm.bank_branch_name "," state_id,state_name,district_id,district_name,bank_id,bank_name,branch_id,branch_name,shg_bank,vo_bank,clf_bank ",
                " where fp.is_active=true and sp.is_active=true and fp.activation_status=2 and sp.activation_status=2 AND NOT EXISTS (SELECT 1 FROM tbl_summary_banks WHERE geographical_flag = 2 AND state_id = fp.state_id AND district_id = fp.district_id AND bank_id = cbd.bank_id AND branch_id = cbd.bank_branch_id AND year_month = to_char(current_date,'YYYY-MM')) ",
                " s.state_id=ab.state_id and s.district_id=ab.district_id and s.bank_id=ab.bank_id and s.branch_id=ab.bank_branch_id ");
        }catch (Exception ex){
            logger.info("Summary Bank Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }

        try{
        fnTableSummary.fn_tbl_summary_bank(3,dateBefore," fp.state_id , sm.state_name_en ,fp.district_id,dm.district_name_en,fp.block_id,blk.block_name_en,cbd.bank_id , bm.bank_name,cbd.bank_branch_id,bbm.bank_branch_name "," state_id,state_name,district_id,district_name,block_id,block_name,bank_id,bank_name,branch_id,branch_name,shg_bank,vo_bank,clf_bank ",
                " where fp.is_active=true and sp.is_active=true and fp.activation_status=2 and sp.activation_status=2 AND NOT EXISTS (SELECT 1 FROM tbl_summary_banks WHERE geographical_flag = 3 AND state_id = fp.state_id AND district_id = fp.district_id AND bank_id = cbd.bank_id AND branch_id = cbd.bank_branch_id AND year_month = to_char(current_date,'YYYY-MM')) ",
                " s.state_id=ab.state_id and s.district_id=ab.district_id and s.block_id=ab.block_id and s.bank_id=ab.bank_id and s.branch_id=ab.bank_branch_id ");
        }catch (Exception ex){
            logger.info("Summary Bank Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }

    }


    public void fn_tbl_summary_cbobanks(String dateBefore){
        try{
        fnTableSummary.fn_tbl_summary_cbobanks(1,dateBefore," fp.state_id,fp.district_id,fp.block_id,sm.state_name_en,dm.district_name_en,blk.block_name_en,bm.bank_type,CASE WHEN bm.bank_type=1 THEN 'REGIONAL BANK' WHEN bm.bank_type=2 THEN 'NATIONALISED BANK' WHEN bm.bank_type=3 THEN 'COOPERATIVE BANK' ELSE NULL END ",
                " state_id,district_id,block_id,state_name,district_name,block_name,bank_type_id,bank_type_name,shg_bank,vo_bank,clf_bank ",
                " where    fp.is_active=true and sp.is_active=true and fp.activation_status=2 and sp.activation_status=2 and NOT EXISTS (select 1 from tbl_summary_cbobanks where geographical_flag=1 and state_id=fp.state_id and district_id=fp.district_id and block_id=fp.block_id and bank_type_id=bm.bank_type) ",
                " s.state_id=ab.state_id and  s.district_id=ab.district_id and s.block_id=ab.block_id and s.bank_type_id=ab.bank_type ");
        }catch (Exception ex){
            logger.info("Summary Cbo Bank Scheduler  geo_flag: "+ 1+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary_cbobanks(2,dateBefore," fp.state_id,fp.district_id,fp.block_id,sm.state_name_en,dm.district_name_en,blk.block_name_en,bm.bank_id,bm.bank_name ",
                " state_id,district_id,block_id,state_name,district_name,block_name,bank_id,bank_name,shg_bank,vo_bank,clf_bank ",
                " where fp.is_active=true and sp.is_active=true and fp.activation_status=2 and sp.activation_status=2 and NOT EXISTS (select 1 from tbl_summary_cbobanks where geographical_flag=2 and state_id=fp.state_id and district_id=fp.district_id and block_id=fp.block_id and bank_id=bm.bank_id) ",
                " s.state_id=ab.state_id and  s.district_id=ab.district_id and s.block_id=ab.block_id and s.bank_id=ab.bank_id ");
        }catch (Exception ex){
            logger.info("Summary Cbo Bank Scheduler  geo_flag: "+ 2+" error  : "+ex.getMessage());
        }
        try{
        fnTableSummary.fn_tbl_summary_cbobanks(3,dateBefore," fp.state_id,fp.district_id,fp.block_id,sm.state_name_en,dm.district_name_en,blk.block_name_en,cbd.bank_branch_id,bbm.bank_branch_name ",
                " state_id,district_id,block_id,state_name,district_name,block_name,branch_id,branch_name,shg_bank,vo_bank,clf_bank ",
                " where fp.is_active=true and sp.is_active=true and fp.activation_status=2 and sp.activation_status=2 and NOT EXISTS (select 1 from tbl_summary_cbobanks where geographical_flag=3 and state_id=fp.state_id and district_id=fp.district_id and block_id=fp.block_id and branch_id=cbd.bank_branch_id) ",
                " s.state_id=ab.state_id and s.district_id=ab.district_id and s.block_id=ab.block_id and s.branch_id=ab.bank_branch_id ");
        }catch (Exception ex){
            logger.info("Summary Cbo Bank Scheduler  geo_flag: "+ 3+" error  : "+ex.getMessage());
        }
    }





}
