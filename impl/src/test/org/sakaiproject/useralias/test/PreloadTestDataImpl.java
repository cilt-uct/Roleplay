/**
 * PreloadTestDataImpl.java - evaluation - Dec 25, 2006 10:07:31 AM - azeckoski
 * $URL$
 * $Id$
 **************************************************************************
 * Copyright (c) 2008 Centre for Applied Research in Educational Technologies, University of Cambridge
 * Licensed under the Educational Community License version 1.0
 * 
 * A copy of the Educational Community License has been included in this 
 * distribution and is available at: http://www.opensource.org/licenses/ecl1.php
 *
 * Aaron Zeckoski (azeckoski@gmail.com) (aaronz@vt.edu) (aaron@caret.cam.ac.uk)
 */

package org.sakaiproject.useralias.test;

import org.sakaiproject.useralias.dao.impl.UserAliasDao;

import lombok.extern.slf4j.Slf4j;






/**
 * This preloads data needed for testing<br/>
 * Do not load this data into a live or production database<br/>
 * Load this after the normal preload<br/>
 * Add the following (or something like it) to a spring beans def file:<br/>
 * <pre>
	<!-- create a test data preloading bean -->
	<bean id="org.sakaiproject.evaluation.test.PreloadTestData"
		class="org.sakaiproject.evaluation.test.PreloadTestDataImpl"
		init-method="init">
		<property name="evaluationDao"
			ref="org.sakaiproject.evaluation.dao.EvaluationDao" />
		<property name="preloadData"
			ref="org.sakaiproject.evaluation.dao.PreloadData" />
	</bean>
 * </pre>
 * @author Aaron Zeckoski (aaronz@vt.edu)
 */

@Slf4j
public class PreloadTestDataImpl {


   private UserAliasDao dao;
   public void setDao(UserAliasDao dao) {
      this.dao = dao;
   }



   private UserAliasTestDataLoad etdl;
   /**
    * @return the test data loading class with copies of all saved objects
    */
   public UserAliasTestDataLoad getEtdl() {
      return etdl;
   }

   public void init() {
      log.info("INIT");

      
   }


}
