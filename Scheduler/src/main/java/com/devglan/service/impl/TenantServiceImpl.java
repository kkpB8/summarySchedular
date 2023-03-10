/**
 *
 */
package com.devglan.service.impl;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.devglan.SchedulerConfig;
import com.devglan.domain.*;
import com.devglan.domain.UploadVoMeeting;
import com.devglan.domain.VoFinTxnVouchers;
import com.devglan.model.*;
import com.devglan.tenant.dao.PGFunctionProcedureService;
import com.devglan.tenant.dao.*;
import com.devglan.utils.AESPasswordEncoder;
import com.devglan.utils.EncryptionAadhaarNrlm;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.SerializationUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.devglan.mapper.GroupMapper;
import com.devglan.mapper.MeetingMapper;
import com.devglan.mapper.MemberMapper;
import com.devglan.mapper.VoMeetingMapper;
import com.devglan.service.TenantService;
import com.devglan.seshat.dao.TenantsDao;
import com.devglan.utils.ServiceConstants;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

//@Service
@Transactional(readOnly = true)
public class TenantServiceImpl<VoMtgDetDao, VoMemLoanScheduleDao, VoMemLoanDao, VoGroupLoanScheduleDao, VoMtgDao, VoMemLoanTxnDao, VoFinTxnDetMemDao, VoFinTxnDao, VoFinTxnDetGrpDao, VoGroupLoanTxnDao, VoLoanApplicationDao> {


}




