package com.devglan.tenant.dao;

import com.devglan.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface FnTableSummaryTwo extends JpaRepository<TestEntity,Long> {

    @Transactional
    @Modifying
    @Procedure( procedureName = "fn_tbl_summary")
        //@Query(value="call fn_tbl_summary(:geo_flag,:groupby,:wherestr,:insertstr,:yrmn);",nativeQuery = true)
    int fn_table_summary(@Param("geo_flag")Integer geo_flag, @Param("groupby")String groupby,
                         @Param("wherestr")String wherestr, @Param("insertstr")String insertstr, @Param("yrmn")String yrmn);

    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary_users")
        // @Query(value="call fn_tbl_summary_users(?1,?2,?3,?4,?5);",nativeQuery = true)
    int fn_tbl_summary_user(@Param("geo_flag")Integer geo_flag, @Param("groupby")String groupby,
                            @Param("wherestr")String wherestr, @Param("insertstr")String insertstr, @Param("yrmn")String yrmn);

    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary1")
        // @Query(value="call fn_tbl_summary1(?1,?2,?3,?4);",nativeQuery = true)
    int fn_tbl_summary1(@Param("geo_flag") Integer geo_flag,@Param("groupby") String groupby,@Param("wherestr") String wherestr,@Param("yrmn") String yrmn);

    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary_bank")
        // @Query(value="call fn_tbl_summary_bank(?1,?2,?3,?4,?5,?6);",nativeQuery = true)
    int fn_tbl_summary_bank(@Param("geo_flag") Integer geo_flag,@Param("yrmn") String yrmn,@Param("groupby") String groupby,@Param("insertstr") String insertstr,
                            @Param("wherestr") String wherestr,@Param("wherestr2") String wherestr2);


    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary_cbobanks")
        //@Query(value="call fn_tbl_summary_cbobanks(?1,?2,?3,?4,?5,?6);",nativeQuery = true)
    int fn_tbl_summary_cbobanks(@Param("geo_flag") Integer geo_flag,@Param("yrmn") String yrmn,@Param("groupby") String groupby,@Param("insertstr") String insertstr,
                                @Param("wherestr") String wherestr,@Param("wherestr2") String wherestr2);

    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary_mem")
    int fn_tbl_summary_mem(@Param("geo_flag") Integer geo_flag,@Param("groupby") String groupby,@Param("wherestr") String insertstr,@Param("insertstr") String wherestr,
                                @Param("yrmn") String yrmn);

    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary_vo")
    int fn_tbl_summary_vo(@Param("geo_flag") Integer geo_flag,@Param("groupby") String groupby,@Param("wherestr") String insertstr,@Param("insertstr") String wherestr,
                           @Param("yrmn") String yrmn);

    @Transactional
    @Modifying
    @Procedure(procedureName = "fn_tbl_summary_clf")
    int fn_tbl_summary_clf(@Param("geo_flag") Integer geo_flag,@Param("groupby") String groupby,@Param("wherestr") String insertstr,@Param("insertstr") String wherestr,
                          @Param("yrmn") String yrmn);
}
