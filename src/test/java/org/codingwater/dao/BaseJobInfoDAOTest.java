package org.codingwater.dao;

import org.codingwater.BaseTest;
import org.codingwater.model.BaseJobInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by water on 4/24/16.
 */
public class BaseJobInfoDAOTest extends BaseTest{

  @Autowired
  private BaseJobInfoDAO baseJobInfoDAO;

  @Test
  public void testSavePosition() throws Exception {
    BaseJobInfo baseJobInfo = new BaseJobInfo();
    baseJobInfo.setPositionId(12345211l);

//    System.out.println(baseJobInfoDAO.savePosition(baseJobInfo));

  }
}