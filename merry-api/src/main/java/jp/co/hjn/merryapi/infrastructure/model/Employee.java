package jp.co.hjn.merryapi.infrastructure.model;

import java.util.Date;

public class Employee {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.id
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.name_first
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String nameFirst;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.name_last
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String nameLast;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.name_first_kana
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String nameFirstKana;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.name_last_kana
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String nameLastKana;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.employee_position
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Integer employeePosition;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.system_role
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Integer systemRole;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.postal_code
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String postalCode;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.prefectures
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String prefectures;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.municipalities
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String municipalities;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.address1
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String address1;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.address2
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String address2;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.phone_number
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String phoneNumber;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.birthday
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Date birthday;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.sex
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Integer sex;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.station
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private String station;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.created_at
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Date createdAt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.updated_at
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Date updatedAt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column employee.deleted_at
     *
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    private Date deletedAt;

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.id
     *
     * @return the value of employee.id
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.id
     *
     * @param id the value for employee.id
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.name_first
     *
     * @return the value of employee.name_first
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getNameFirst() {
        return nameFirst;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.name_first
     *
     * @param nameFirst the value for employee.name_first
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.name_last
     *
     * @return the value of employee.name_last
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getNameLast() {
        return nameLast;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.name_last
     *
     * @param nameLast the value for employee.name_last
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.name_first_kana
     *
     * @return the value of employee.name_first_kana
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getNameFirstKana() {
        return nameFirstKana;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.name_first_kana
     *
     * @param nameFirstKana the value for employee.name_first_kana
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setNameFirstKana(String nameFirstKana) {
        this.nameFirstKana = nameFirstKana;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.name_last_kana
     *
     * @return the value of employee.name_last_kana
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getNameLastKana() {
        return nameLastKana;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.name_last_kana
     *
     * @param nameLastKana the value for employee.name_last_kana
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setNameLastKana(String nameLastKana) {
        this.nameLastKana = nameLastKana;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.employee_position
     *
     * @return the value of employee.employee_position
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Integer getEmployeePosition() {
        return employeePosition;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.employee_position
     *
     * @param employeePosition the value for employee.employee_position
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setEmployeePosition(Integer employeePosition) {
        this.employeePosition = employeePosition;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.system_role
     *
     * @return the value of employee.system_role
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Integer getSystemRole() {
        return systemRole;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.system_role
     *
     * @param systemRole the value for employee.system_role
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setSystemRole(Integer systemRole) {
        this.systemRole = systemRole;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.postal_code
     *
     * @return the value of employee.postal_code
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.postal_code
     *
     * @param postalCode the value for employee.postal_code
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.prefectures
     *
     * @return the value of employee.prefectures
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getPrefectures() {
        return prefectures;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.prefectures
     *
     * @param prefectures the value for employee.prefectures
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setPrefectures(String prefectures) {
        this.prefectures = prefectures;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.municipalities
     *
     * @return the value of employee.municipalities
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getMunicipalities() {
        return municipalities;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.municipalities
     *
     * @param municipalities the value for employee.municipalities
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setMunicipalities(String municipalities) {
        this.municipalities = municipalities;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.address1
     *
     * @return the value of employee.address1
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.address1
     *
     * @param address1 the value for employee.address1
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.address2
     *
     * @return the value of employee.address2
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.address2
     *
     * @param address2 the value for employee.address2
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.phone_number
     *
     * @return the value of employee.phone_number
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.phone_number
     *
     * @param phoneNumber the value for employee.phone_number
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.birthday
     *
     * @return the value of employee.birthday
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.birthday
     *
     * @param birthday the value for employee.birthday
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.sex
     *
     * @return the value of employee.sex
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.sex
     *
     * @param sex the value for employee.sex
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.station
     *
     * @return the value of employee.station
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public String getStation() {
        return station;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.station
     *
     * @param phoneNumber the value for employee.station
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setStation(String station) {
        this.station = station;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.created_at
     *
     * @return the value of employee.created_at
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.created_at
     *
     * @param createdAt the value for employee.created_at
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.updated_at
     *
     * @return the value of employee.updated_at
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.updated_at
     *
     * @param updatedAt the value for employee.updated_at
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column employee.deleted_at
     *
     * @return the value of employee.deleted_at
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column employee.deleted_at
     *
     * @param deletedAt the value for employee.deleted_at
     * @mbg.generated Wed Jan 25 00:14:04 JST 2023
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}