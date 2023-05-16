/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.unitime.timetable.gwt.client.instructor.survey.InstructorSurveyInterface;
import org.unitime.timetable.model.Advisor;
import org.unitime.timetable.model.AdvisorCourseRequest;
import org.unitime.timetable.model.CourseDemand;
import org.unitime.timetable.model.LastLikeCourseDemand;
import org.unitime.timetable.model.Session;
import org.unitime.timetable.model.Student;
import org.unitime.timetable.model.StudentAccomodation;
import org.unitime.timetable.model.StudentAreaClassificationMajor;
import org.unitime.timetable.model.StudentAreaClassificationMinor;
import org.unitime.timetable.model.StudentClassEnrollment;
import org.unitime.timetable.model.StudentGroup;
import org.unitime.timetable.model.StudentNote;
import org.unitime.timetable.model.StudentSectioningStatus;
import org.unitime.timetable.model.WaitList;

/**
 * Do not change this class. It has been automatically generated using ant
 * create-model.
 * 
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseStudent implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long iUniqueId;
	private String iExternalUniqueId;
	private String iFirstName;
	private String iMiddleName;
	private String iLastName;
	private String iEmail;
	private Integer iFreeTimeCategory;
	private Integer iSchedulePreference;
	private Float iMaxCredit;
	private Float iMinCredit;
	private Float iOverrideMaxCredit;
	private Integer iOverrideStatus;
	private String iOverrideExternalId;
	private Date iOverrideTimeStamp;
	private Integer iOverrideIntent;
	private String iPin;
	private Boolean iPinReleased;
	private Date iClassStartDate;
	private Date iClassEndDate;
	private Date iScheduleEmailedDate;

	private Session iSession;
	private StudentSectioningStatus iSectioningStatus;
	private Set<StudentAreaClassificationMajor> iAreaClasfMajors;
	private Set<StudentAreaClassificationMinor> iAreaClasfMinors;
	private Set<StudentAccomodation> iAccomodations;
	private Set<StudentGroup> iGroups;
	private Set<WaitList> iWaitlists;
	private Set<CourseDemand> iCourseDemands;
	private Set<StudentClassEnrollment> iClassEnrollments;
	private Set<LastLikeCourseDemand> iLastLikeCourseDemands;
	private Set<StudentNote> iNotes;
	private Set<Advisor> iAdvisors;
	private Set<AdvisorCourseRequest> iAdvisorCourseRequests;
	
	public static String PROP_UNIQUEID = 
	lic static String PROP_EXTERNAL_UID = "externalUniqueId";
	public static String PROP_FIRST_NAME = "firstName";
	public static String PROP_MIDDLE_NAME = "middleName";
	public static String PROP_LAST_NAME = "lastName";
	public static String PROP_EMAIL = "email";
	public static String PROP_FREE_TIME_CAT = "freeTimeCategory";
	public static String PROP_SCHEDULE_PREFERENCE = "schedulePreference";
	public static String PROP_MAX_CREDIT = "maxCredit";
	public static String PROP_MIN_CREDIT = "minCredit";
	public static String PROP_REQ_CREDIT = "overrideMaxCredit";
	public static String PROP_REQ_STATUS = "overrideStatus";
	public static String PROP_REQ_EXTID = "overrideExternalId";
	public static String PROP_REQ_TS = "overrideTimeStamp";
	public static String PROP_REQ_INTENT = "overrideIntent";
	public static String PROP_PIN = "pin";
	public static String PROP_PIN_RELEASED = "pinReleased";
	public static String PROP_CLASS_START = "classStartDate";
	public static String PROP_CLASS_END = "classEndDate";
	public static String PROP_SCHEDULE_EMAILED = "scheduleEmailedDate";

	public BaseStudent() {
		initialize();
	}

	public BaseStudent(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Long getUniqueId() { r
	eturn iUniqueId; }
	public void setUniqueId(Long uniqueId) { iUniqueId = uniqueId; }

		
	

	public String getExternalUniqueId() { re
		urn iExternalUniqueId
	 }
	public void setExternalUniqueId(String externalUniqueId) { iExternalUniqueId = externalUniqueId; }

		
	

	public String getFirstName() { return iFirstName; }
		
	
	public void setFirstName(String firstName) { iFirstName = firstName; }

		
	

	public String getMiddleName() { return iMidd
		eName; }
	
	public void setMiddleName(String middleName) { iMiddleName = middleName; }

		
	

	public String getLastName() { return iLastName
		 }
	
	public void setLastName(String lastName) { iLastName = lastName; }

		
	

	public String getEmail() { return iEmail; 
		
	
	public void setEmail(String email) { iEmail = email; }

		
	

	public Integer getFreeTimeCategory()
		{ return iFreeT
	meCategory; }
	public void setFreeTimeCategory(Integer freeTimeCategory) { iFreeTimeCategory = freeTimeCategory; }

		
	

	public Integer getSchedulePreference() { return iSchedulePr
		ference; }
	
	public void setSchedulePreference(Integer schedulePreference) { iSchedulePreference = schedulePreference; }

		
	

	public Float getMaxCredit() { return iMaxCredit; }
		
	
	public void setMaxCredit(Float maxCredit) { iMaxCredit = maxCredit; }

		
	

	public Float getMinCredit() { return iMinCr
		dit; }
	
	public void setMinCredit(Float minCredit) { iMinCredit = minCredit; }

		
	

	public Float getOverrideMaxCredit() { retur
		 iOverrideMaxCredit; }
	
	public void setOverrideMaxCredit(Float overrideMaxCredit) { iOverrideMaxCredit = overrideMaxCredit; }

		
	

	public Integer getOverrideStatus() { return iOverrideStatus
		 }
	
	public void setOverrideStatus(Integer overrideStatus) { iOverrideStatus = overrideStatus; }

		
	

	public String getOverrideExternalId() { return iOverrid
		ExternalId; }
	
	public void setOverrideExternalId(String overrideExternalId) { iOverrideExternalId = overrideExternalId; }

		
	

	public Date getOverrideTimeStamp() { return iOverrideTimeStamp
		 }
	
	public void setOverrideTimeStamp(Date overrideTimeStamp) { iOverrideTimeStamp = overrideTimeStamp; }

		
	

	public Integer getOverrideIntent() { return iOverrideInten
		; }
	
	public void setOverrideIntent(Integer overrideIntent) { iOverrideIntent = overrideIntent; }

		
	

	public String getPin() { return iPin; }
		
	
	public void setPin(String pin) { iPin = pin; }

		
	

	public Boolean isPinReleased() {
		return iPin
	eleased; }
	public Boolean getPinReleased() { return iPinReleased; }
	public void setPinReleased(Boole
		n pinReleased) { iPi
	R

	
		
	

	public Date getClassStartDate() { return iClassSt
		rtDate; }
	
	public void setClassStartDate(Date classStartDate) { iClassStartDate = classStartDate; }

		
	

	public Date getClassEndDate() { return iClassEndDate
		 }
	
	public void setClassEndDate(Date classEndDate) { iClassEndDate = classEndDate; }

		
	

	public Date getScheduleEmailedDate() { return iS
		heduleEmailedDate; }
	
	public void setScheduleEmailedDate(Date scheduleEmailedDate) { iScheduleEmailedDate = scheduleEmailedDate; }

		
	

	public Session getSession() { return iSession; }
		
	
	public void setSession(Session session) { iSession = session; }

		
	

	public StudentSectioningStatus getSection
		ngStatus() { return
	iSectioningStatus; }
	public void setSectioningStatus(StudentSectioningStatus sectioningStatus) { iSectioningStatus = sectioningStatus; }

		
	

	public Set<StudentAreaClassificationMajor> getAreaClasfMajors() { return iA
		eaClasfMajors; }
	
	public void setAreaClasfMajors(Set<StudentAreaClassificationMajor> areaClasfMajors) { iAreaClasfMajors = areaClasfMajors; }
	public void addToareaClasfMajors(StudentAreaClassificationMajor s
		udentAreaClassificationM
	j

		if (iAreaClasfMajors == null) iAreaClasfMajors = new HashSet<StudentAreaClassificati
		nMajor>();
	

		iAreaClasfMajors.add(studentAreaClassificationMajor);
	}
			

	public Set<StudentAreaClassificationMinor> getAreaClasfMinors() { return iAreaClasfMinors; }
	public void setAreaClasfMinors(Set<StudentAreaClassificationMinor> areaClasfMinors) { iAreaClasfMinors = areaClasfMinors; }
	public void addToareaClasfMinors(StudentAreaClassificationMinor s
		udentAreaClassificationM
	n

		if (iAreaClasfMinors == null) iAreaClasfMinors = new HashSet<StudentAreaClassificati
		nMinor>();
	

		iAreaClasfMinors.add(studentAreaClassificationMinor);
	}
			

	public Set<StudentAccomodation> getAccomodations() { return iAccomodations; }
	public void setAccomodations(Set<StudentAccomodation> accomodations) { iAccomodations = accomodations; }
	public void addToaccomodations(StudentAccomodation s
		udentAccomodation) {
	

		if (iAccomodations == null) iAccomodations = new HashSet<StudentAccom
		dation>();
	

		iAccomodations.add(studentAccomodation);
	}
			

	public Set<StudentGroup> getGroups() { return iGroups; }
	public void setGroups(Set<StudentGroup> groups) { iGroups = groups; }
	public void addTogroups(StudentGroup s
		udentGroup) {
	

		if (iGroups == null) iGroups = new HashSet<Stude
		tGroup>();
	

		iGroups.add(studentGroup);
	}
			

	public Set<WaitList> getWaitlists() { return iWaitlists; }
	public void setWaitlists(Set<WaitList> waitlists) { iWaitlists = waitlists; }
	public void addTowaitlists(WaitList w
		itList) {
	

		if (iWaitlists == null) iWaitlists = new HashSet<W
		itList>();
	

		iWaitlists.add(waitList);
	}
			

	public Set<CourseDemand> getCourseDemands() { return iCourseDemands; }
	public void setCourseDemands(Set<CourseDemand> courseDemands) { iCourseDemands = courseDemands; }
	public void addTocourseDemands(CourseDemand c
		urseDemand) {
	

		if (iCourseDemands == null) iCourseDemands = new HashSet<Cours
		Demand>();
	

		iCourseDemands.add(courseDemand);
	}
			

	public Set<StudentClassEnrollment> getClassEnrollments() { return iClassEnrollments; }
	public void setClassEnrollments(Set<StudentClassEnrollment> classEnrollments) { iClassEnrollments = classEnrollments; }
	public void addToclassEnrollments(StudentClassEnrollment s
		udentClassEnrollment) {
	

		if (iClassEnrollments == null) iClassEnrollments = new HashSet<StudentClassEnr
		llment>();
	

		iClassEnrollments.add(studentClassEnrollment);
	}
			

	public Set<LastLikeCourseDemand> getLastLikeCourseDemands() { return iLastLikeCourseDemands; }
	public void setLastLikeCourseDemands(Set<LastLikeCourseDemand> lastLikeCourseDemands) { iLastLikeCourseDemands = lastLikeCourseDemands; }
	public void addTolastLikeCourseDemands(LastLikeCourseDemand l
		stLikeCourseDemand) {
	

		if (iLastLikeCourseDemands == null) iLastLikeCourseDemands = new HashSet<LastLikeCours
		Demand>();
	

		iLastLikeCourseDemands.add(lastLikeCourseDemand);
	}
			

	public Set<StudentNote> getNotes() { return iNotes; }
	public void setNotes(Set<StudentNote> notes) { iNotes = notes; }
	public void addTonotes(StudentNote s
		udentNote) {
	

		if (iNotes == null) iNotes = new HashSet<Stud
		ntNote>();
	

		iNotes.add(studentNote);
	}
			

	public Set<Advisor> getAdvisors() { return iAdvisors; }
	public void setAdvisors(Set<Advisor> advisors) { iAdvisors = advisors; }
	public void addToadvisors(Advisor a
		visor) {
	

		if (iAdvisors == null) iAdvisors = new HashSet<
		dvisor>();
	

		iAdvisors.add(advisor);
	}
			

	public Set<AdvisorCourseRequest> getAdvisorCourseRequests() { return iAdvisorCourseRequests; }
	public void setAdvisorCourseRequests(Set<AdvisorCourseRequest> advisorCourseRequests) { iAdvisorCourseRequests = advisorCourseRequests; }
	public void addToadvisorCourseRequests(AdvisorCourseRequest a
		visorCourseRequest) {
	

		if (iAdvisorCourseRequests == null) iAdvisorCourseRequests = new HashSet<AdvisorCourse
		equest>();
	

		iAdvisorCourseRequests.add(advisorCourseRequest);
	}
			

	public boolean equals(Object o) {
		if (o == null || !(o instanceof Student)) return false;
		if (getUniqueId() == null || ((Student)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((Student)o).
			etUniqueId());
	} 
			
 
	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}
			

	public String toString() {
		return "Student["+getUniqueId()+"]";
	}
    
	public String toDebugString() {
		return "Student[" +
			"\n	ClassEndDate: " + getClassEndDate() +
			"\n	ClassStartDate
				"\n	Email: " + getEmail() +
				"\n	ExternalUniqueId: " + getExternalUniqueId
				"\n	FirstName: " + getFirst
				"\n	FreeTimeCategory: " + getFreeTimeCategory() +
				"\n	LastName: " + getLastName() +
				"\n	MaxCredit: " + getMaxCredit() +
				"\n	MiddleName: " + getMiddleName
				"\n	MinCredit: " + getMinCredit() +
				"\n	OverrideExternalId: " + getOverri
				"\n	OverrideIntent: " + getOverride
				"\n	OverrideMaxCredit: " + getOverrideMaxCredit() +
				"\n	OverrideStatus: " + getOverrideStatus() +
				"\n	OverrideTimeStamp: " + getOverrideTimeStamp() +
				"\n	Pin: " + getPin() +
				"\n	PinReleased: " + getPinReleased() +
				"\n	ScheduleEmailedDate
				"\n	SchedulePreference: " + getSchedule
				"\n	SectioningStatus: " + getSectioningStatus() +
				"\n	Session: " + getSession() +
				"\n	UniqueId: " + getUniqueId() +
				"]";
				
				


	  