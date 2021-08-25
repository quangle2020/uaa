package com.quanglv.constant;

import com.quanglv.utils.FieldTypeEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Application constants.
 */
public interface Constants {

    String ROW_ID = "rowId";
    String ROW_IDS = "rowIds";
    String ERROR_ITEM = "item";
    String ERROR_CODE = "errorCode";
    String ERROR_PARAMS = "errorParams";
    int RESPONSE_SUCCESS = 0;
    int RESPONSE_FAILED = 1;

    String SYSTEM_ACCOUNT = "system";
    String ANONYMOUS_USER = "anonymoususer";
    String DEFAULT_TENANT_ID = "default";
    String HEADER_TENANT_ID = "X-TenantID";
    String HEADER_ACCESS_TOKEN = "X-AccessToken";
    String HEADER_TIMEZONE = "timezone";
    String UTC_TIMEZONE = "UTC";
    String EMPLOYEE_ID = "employeeId";
    String LANGUAGE_CODE = "languageCode";
    String EMPLOYEE_NAME = "employeeName";
    String LICENSES = "licenses";
    String EMAIL = "email";
    String DYNAMIC_DATE_TIME_VALIUE_KEY = "date_time";
    String DYNAMIC_DATE_VALIUE_KEY = "date";
    String DYNAMIC_TIME_VALIUE_KEY = "time";
    String DYNAMIC_VALIUE_KEY = "value";
    String DYNAMIC_LABEL_KEY = "label";

    String PERIOD = ".";
    String COMMA = ",";
    String EMPTY = "";
    String NULL_STRING = "null";
    String FORMAT_COLUMN_SEARCH = "%.%";

    String FIELD_NAME_DEPARTMENT_ID = "department_id";
    String FIELD_NAME_EMPLOYEE_ID = "employee_id";
    String FIELD_NAME_GROUP_ID = "group_id";

    String TENANT_FORMAT = "^(?=.*[a-z0-9])[a-z0-9]+$";
    String URL_API_GET_TENANT = "/public/api/get-tenant-by-condition";
    String URL_API_GET_SERVICES_OF_USER = "get-services";

    String TENANTS_BATCH = "tenantforbatch";

    String TENANTS_SERVICE = "tenants";
    String LIST_OF_PRODUCT_TRADING_ID = "listOfProductTradingId";
    String PRODUCT_TRADING_ID = "productTradingId";
    String ID_OF_NEW_LIST = "idOfNewList";
    String ID_OF_OLD_LIST = "idOfOldList";
    String DEFAULT_TIMEZONE = "Asia/Tokyo";

    /**
     * 接続に失敗しました。
     */
    String CONNECT_FAILED_CODE = "ERR_COM_0001";

    /**
     * 無効な日付フォーマット·エラー·コード
     */
    String FORMAT_DATE_CODE = "ERR_COM_0034";
    /**
     * フォーマット無効なエラーコード
     */
    String FORMAT_INVALID_CODE = "ERR_COM_0034";
    String FORMAT_INVALID_NUMBER_HYPHEN_CODE = "ERR_COM_0034";

    /**
     * メールを取得するリストID
     */
    String PARAMETER_INVALID = "ERR_COM_0035";

    /**
     * Email invalid code
     */
    String EMAIL_INVALID_CODE = "ERR_COM_0017";

    /**
     * Email invalid code
     */
    String PHONE_INVALID_CODE = "ERR_COM_0020";

    /**
     * TIME invalid code
     */
    String TIME_INVALID_CODE = "ERR_COM_0019";
    /**
     * DATETIME invalid code
     */
    String DATETIME_INVALID_CODE = "ERR_COM_0054";
    /**
     * DATE invalid code
     */
    String DATE_INVALID_CODE = "ERR_COM_0018";
    /**
     * ALPHABE invalid code
     */
    String ALPHABE_INVALID_CODE = "ERR_COM_0021";

    /**
     * DECIMAL invalid code
     */
    String DECIMAL_INVALID_CODE = "ERR_COM_0015";
    /**
     * 無効なエラーコード番号
     */
    String NUMBER_INVALID_CODE = "ERR_COM_0015";
    /**
     * emoji
     */
    String EMOJI_INVALID_CODE = "ERR_COM_0015";

    /**
     * greater than maxlength
     */
    String GREATER_LENGTH_CODE = "ERR_COM_0025";
    /**
     * less length
     */
    String LESS_LENGTH_CODE = "ERR_COM_0026";
    /**
     * 長エラーコード上正の部分
     */
    String POSITIVE_CODE = "ERR_COM_0029";
    /**
     * 長エラーコード上小数部
     */
    String DECIMAL_CODE = "ERR_COM_0030";
    /**
     * MAXよりエラーコード番号より
     */
    String NUMBER_MAX_CODE = "ERR_COM_0027";
    /**
     * MINエラーコード番号少ない石炭
     */
    String NUMBER_MIN_CODE = "ERR_COM_0028";
    /**
     * エラーコードが必要に
     */
    String RIQUIRED_CODE = "ERR_COM_0013";
    /**
     * productCategoryLevel greater than 15
     */
    String CATEGORY_LEVEL_GREATER_THAN_15 = "ERR_PRO_0002";
    /**
     * {0}の形式で入力してください。
     */
    String MAIL_VALIDATE_ERROR = "ERR_COM_0034";
    String USER_NOT_ADMIN = "ERR_COM_0007";

    String CREATE_FAILED = "ERR_COM_0003";

    String UPDATE_FAILED = "ERR_COM_0004";

    String DELETE_FAILED = "ERR_COM_0005";

    String MAX_LENGTH = "ERR_COM_0025";

    String INTERRUPT_API = "ERR_COM_0012";

    String ITEM_NOT_EXIST = "ERR_COM_0035";

    String TENANT_IS_EXIST = "ERR_COM_0036";

    String ERR_COM_0070 = "ERR_COM_0070";

    String ERR_COM_0067 = "ERR_COM_0067";

    String ERR_COM_0068 = "ERR_COM_0068";

    String ERR_COM_0069 = "ERR_COM_0069";

    String ERR_COM_0078 = "ERR_COM_0078";

    String SEARCH_CONDITION_AUTO_NOT_EXIST = "ERR_COM_0059";

    String AT_LEAST_1_IS_OWNER = "ERR_COM_0061";

    String REQUIRED_PARAMETER = "ERR_TEN_0001";

    String STATUS_NOT_STARTUP = "ERR_TEN_0002";

    String INTEGER_PARAMETER = "ERR_TEN_0003";

    String CREATED = "INF_COM_0003";

    String UPDATED = "INF_COM_0004";

    String ESTABLISH_SUCCESS = "INF_COM_0008";

    String NO_DATA_SEARCH = "INF_COM_0007";

    String TENANT_CREATING_ERROR = "ERR_TEN_0004";

    String RANGE_DATE_CODE = "ERR_COM_0082";

    String LOOK_UP_ERROR = "ERR_COM_0084";

    String KEY_LOOK_UP_ERROR = "ERR_COM_0087";

    String RELATION_ERROR = "ERR_COM_0085";

    String CALCULATOR_ERROR = "ERR_COM_0086";

    /**
     * テナント null
     */
    String TENANTS_NOT_NULL = "ERR_COM_0036";

    String TENANTS_MESSAGE_SUCCESS = "INFO_TEN_001";

    String ITEM_IS_NOT_EXISTED = "ERR_BUS_0002";
    String ITEM_IS_DELETED = "ERR_BUS_0003";
    String ITEM_IS_EXISTED = "ERR_BUS_0004";
    String REDIS_USER_ACCESS_KEY = "user_access_time";

    /**
     * テキストエンコーディングの定数
     */
    class Text {
        private Text() {
            // do nothing
        }

        String WINDOWS_31J = "WINDOWS-31J";
        String CRLF = "\r\n";
    }

    /**
     * Field belong enum
     */
    public enum FieldBelong {
        EMPLOYEE(8), CUSTOMER(5), BUSINESS_CARD(4), TIMELINE(3), TIMELINE_GROUP(301), LOG_ACCESS(2101), ACTIVITY(6),
        PRODUCT(14), TASK(15), MILESTONE(1501), SCHEDULE(2), TRADING_PRODUCT(16), PRODUCT_ITEM(1401), DEPARTMENT(801),
        SALE(16), ANALYSIS(10);

        private int value;

        private FieldBelong(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static FieldBelong getEnum(int value) {
            for (FieldBelong fieldBelong : values()) {
                if (fieldBelong.getValue() == value)
                    return fieldBelong;
            }
            return null;
        }

        public static List<Integer> getFieldBelongList() {
            List<Integer> fieldBelongList = new ArrayList<>();
            for (FieldBelong fieldBelong : values()) {
                fieldBelongList.add(fieldBelong.getValue());
            }
            return fieldBelongList;
        }
    }

    /**
     * Tab belong enum
     */
    public enum TabBelong {
        EMPLOYEE(8), CUSTOMER(5), BUSINESS_CARD(4), TIMELINE(3), TIMELINE_GROUP(301), LOG_ACCESS(2101), ACTIVITY(6),
        PRODUCT(14), TASK(15), MILESTONE(1501), SCHEDULE(2), TRADING_PRODUCT(16), PRODUCT_ITEM(1401);

        private int value;

        private TabBelong(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<Integer> getTabBelongList() {
            List<Integer> tabBelongList = new ArrayList<>();
            for (TabBelong tabBelong : values()) {
                tabBelongList.add(tabBelong.getValue());
            }
            return tabBelongList;
        }
    }

    /**
     * Modify Flag enum
     */
    public enum ModifyFlag {
        READ_ONLY(0), ANY(1), REQUIRED(2), DEFAULT_REQUIRED(3);

        private Integer value;

        private ModifyFlag(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * Extension belong enum
     */
    public enum ExtensionBelong {
        SHOW_IN_LIST(1), SEARCH(2);

        private int value;

        private ExtensionBelong(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<Integer> getExtensionBelongList() {
            List<Integer> extensionBelongList = new ArrayList<>();
            for (ExtensionBelong extensionBelong : values()) {
                extensionBelongList.add(extensionBelong.getValue());
            }
            return extensionBelongList;
        }
    }

    /**
     * Available Flag enum
     */
    public enum AvailableFlag {
        UNAVAILABLE(0), AVAILABLE(3);

        private Integer value;

        private AvailableFlag(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * Relation Format enum
     */
    public enum RelationFormat {
        SINGLE(1), MULTI(2);

        private Integer value;

        private RelationFormat(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * File extension
     */
    class Elasticsearch {
        private Elasticsearch() {
            // do nothing
        }

        String INDEX_FIELD = "index";
        String SUFFIX_FIELD_FULLTEXT = "_str";
        int DEFAULT_LIMIT = 1000000;
        String TRUE_VALUE = "true";
        String TO_OPTIONAL = "toOptional";
        String FROM_OPTIONAL = "fromOptional";
        String ELASTICSEARCH_INDEX_FORMAT = "%s_%s";

        /**
         * search operator 1: OR, 2: AND
         */
        public enum Operator {
            OR(1), AND(2);

            private int value;

            private Operator(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }
        }

        /**
         * define elasticsearch index
         */
        private static Map<Integer, String> indexMap = new HashMap<>();
        static {
            indexMap.put(FieldBelong.EMPLOYEE.getValue(), "employee");
            indexMap.put(FieldBelong.CUSTOMER.getValue(), "customer");
            indexMap.put(FieldBelong.BUSINESS_CARD.getValue(), "businesscard");
            indexMap.put(FieldBelong.SCHEDULE.getValue(), "calendar");
            indexMap.put(FieldBelong.PRODUCT.getValue(), "product");
            indexMap.put(FieldBelong.ACTIVITY.getValue(), "activity");
            indexMap.put(FieldBelong.TRADING_PRODUCT.getValue(), "sale");
            indexMap.put(FieldBelong.ANALYSIS.getValue(), "analysis_data_set");

        }

        /**
         * define main table of function
         */
        private static Map<Integer, String> tableMainMap = new HashMap<>();
        static {
            tableMainMap.put(FieldBelong.EMPLOYEE.getValue(), MICRO_SERVICE_EMPLOYEES);
            tableMainMap.put(FieldBelong.CUSTOMER.getValue(), MICRO_SERVICE_CUSTOMERS);
            tableMainMap.put(FieldBelong.BUSINESS_CARD.getValue(), "business_cards");
            tableMainMap.put(FieldBelong.SCHEDULE.getValue(), "calendars");
            tableMainMap.put(FieldBelong.TASK.getValue(), "tasks");
            tableMainMap.put(FieldBelong.PRODUCT.getValue(), MICRO_SERVICE_PRODUCTS);
            tableMainMap.put(FieldBelong.ACTIVITY.getValue(), MICRO_SERVICE_ACTIVITIES);
            tableMainMap.put(FieldBelong.TIMELINE.getValue(), MICRO_SERVICE_TIMELINES);
            tableMainMap.put(FieldBelong.TRADING_PRODUCT.getValue(), "products_tradings");
        }

        /**
         * define column data
         */
        private static Map<Integer, String> columnDataMap = new HashMap<>();
        static {
            columnDataMap.put(FieldBelong.EMPLOYEE.getValue(), "employee_data");
            columnDataMap.put(FieldBelong.CUSTOMER.getValue(), "customer_data");
            columnDataMap.put(FieldBelong.BUSINESS_CARD.getValue(), "business_card_data");
            columnDataMap.put(FieldBelong.SCHEDULE.getValue(), "calendar_data");
            columnDataMap.put(FieldBelong.TASK.getValue(), "task_data");
            columnDataMap.put(FieldBelong.PRODUCT.getValue(), "product_data");
            columnDataMap.put(FieldBelong.ACTIVITY.getValue(), "activity_data");
            columnDataMap.put(FieldBelong.TIMELINE.getValue(), "timeline_data");
            columnDataMap.put(FieldBelong.TRADING_PRODUCT.getValue(), "product_trading_data");
        }

        /**
         * define column primary key
         */
        private static Map<Integer, String> columnPKMap = new HashMap<>();
        static {
            columnPKMap.put(FieldBelong.EMPLOYEE.getValue(), FIELD_NAME_EMPLOYEE_ID);
            columnPKMap.put(FieldBelong.CUSTOMER.getValue(), "customer_id");
            columnPKMap.put(FieldBelong.BUSINESS_CARD.getValue(), "business_card_id");
            columnPKMap.put(FieldBelong.SCHEDULE.getValue(), "calendar_id");
            columnPKMap.put(FieldBelong.TASK.getValue(), "task_id");
            columnPKMap.put(FieldBelong.PRODUCT.getValue(), "product_id");
            columnPKMap.put(FieldBelong.ACTIVITY.getValue(), "activity_id");
            columnPKMap.put(FieldBelong.TIMELINE.getValue(), "timeline_id");
            columnPKMap.put(FieldBelong.TRADING_PRODUCT.getValue(), "product_trading_id");
        }

        /**
         * define field type
         */
        private static Map<String, String> fieldTypeMap = new HashMap<>();
        static {
            fieldTypeMap.put(FieldTypeEnum.PULLDOWN.getCode(), FieldTypeEnum.PULLDOWN.getType());
            fieldTypeMap.put(FieldTypeEnum.MULTIPLE_PULLDOWN.getCode(), FieldTypeEnum.MULTIPLE_PULLDOWN.getType());
            fieldTypeMap.put(FieldTypeEnum.CHECKBOX.getCode(), FieldTypeEnum.CHECKBOX.getType());
            fieldTypeMap.put(FieldTypeEnum.RADIO.getCode(), FieldTypeEnum.RADIO.getType());
            fieldTypeMap.put(FieldTypeEnum.NUMBER.getCode(), FieldTypeEnum.NUMBER.getType());
            fieldTypeMap.put(FieldTypeEnum.DATE.getCode(), FieldTypeEnum.DATE.getType());
            fieldTypeMap.put(FieldTypeEnum.DATETIME.getCode(), FieldTypeEnum.DATETIME.getType());
            fieldTypeMap.put(FieldTypeEnum.TIME.getCode(), FieldTypeEnum.TIME.getType());
            fieldTypeMap.put(FieldTypeEnum.TEXT.getCode(), FieldTypeEnum.TEXT.getType());
            fieldTypeMap.put(FieldTypeEnum.TEXTAREA.getCode(), FieldTypeEnum.TEXTAREA.getType());
            fieldTypeMap.put(FieldTypeEnum.FILE.getCode(), FieldTypeEnum.FILE.getType());
            fieldTypeMap.put(FieldTypeEnum.LINK.getCode(), FieldTypeEnum.LINK.getType());
            fieldTypeMap.put(FieldTypeEnum.PHONE.getCode(), FieldTypeEnum.PHONE.getType());
            fieldTypeMap.put(FieldTypeEnum.ADDRESS.getCode(), FieldTypeEnum.ADDRESS.getType());
            fieldTypeMap.put(FieldTypeEnum.EMAIL.getCode(), FieldTypeEnum.EMAIL.getType());
            fieldTypeMap.put(FieldTypeEnum.CALCULATION.getCode(), FieldTypeEnum.CALCULATION.getType());
            fieldTypeMap.put(FieldTypeEnum.RELATION.getCode(), FieldTypeEnum.RELATION.getType());
            fieldTypeMap.put(FieldTypeEnum.SELECT_ORGANIZATION.getCode(), FieldTypeEnum.SELECT_ORGANIZATION.getType());
            fieldTypeMap.put(FieldTypeEnum.LOOKUP.getCode(), FieldTypeEnum.LOOKUP.getType());
            fieldTypeMap.put(FieldTypeEnum.TAB.getCode(), FieldTypeEnum.TAB.getType());
            fieldTypeMap.put(FieldTypeEnum.HEADING.getCode(), FieldTypeEnum.HEADING.getType());
        }

        /**
         * define field type
         */
        private static Map<String, String> sequenceMap = new HashMap<>();
        static {
            sequenceMap.put(FieldTypeEnum.PULLDOWN.getCode(), FieldTypeEnum.PULLDOWN.getSequence());
            sequenceMap.put(FieldTypeEnum.MULTIPLE_PULLDOWN.getCode(), FieldTypeEnum.MULTIPLE_PULLDOWN.getSequence());
            sequenceMap.put(FieldTypeEnum.CHECKBOX.getCode(), FieldTypeEnum.CHECKBOX.getSequence());
            sequenceMap.put(FieldTypeEnum.RADIO.getCode(), FieldTypeEnum.RADIO.getSequence());
            sequenceMap.put(FieldTypeEnum.NUMBER.getCode(), FieldTypeEnum.NUMBER.getSequence());
            sequenceMap.put(FieldTypeEnum.DATE.getCode(), FieldTypeEnum.DATE.getSequence());
            sequenceMap.put(FieldTypeEnum.DATETIME.getCode(), FieldTypeEnum.DATETIME.getSequence());
            sequenceMap.put(FieldTypeEnum.TIME.getCode(), FieldTypeEnum.TIME.getSequence());
            sequenceMap.put(FieldTypeEnum.TEXT.getCode(), FieldTypeEnum.TEXT.getSequence());
            sequenceMap.put(FieldTypeEnum.TEXTAREA.getCode(), FieldTypeEnum.TEXTAREA.getSequence());
            sequenceMap.put(FieldTypeEnum.FILE.getCode(), FieldTypeEnum.FILE.getSequence());
            sequenceMap.put(FieldTypeEnum.LINK.getCode(), FieldTypeEnum.LINK.getSequence());
            sequenceMap.put(FieldTypeEnum.PHONE.getCode(), FieldTypeEnum.PHONE.getSequence());
            sequenceMap.put(FieldTypeEnum.ADDRESS.getCode(), FieldTypeEnum.ADDRESS.getSequence());
            sequenceMap.put(FieldTypeEnum.EMAIL.getCode(), FieldTypeEnum.EMAIL.getSequence());
            sequenceMap.put(FieldTypeEnum.CALCULATION.getCode(), FieldTypeEnum.CALCULATION.getSequence());
            sequenceMap.put(FieldTypeEnum.RELATION.getCode(), FieldTypeEnum.RELATION.getSequence());
            sequenceMap.put(FieldTypeEnum.SELECT_ORGANIZATION.getCode(), FieldTypeEnum.SELECT_ORGANIZATION.getSequence());
            sequenceMap.put(FieldTypeEnum.LOOKUP.getCode(), FieldTypeEnum.LOOKUP.getSequence());
            sequenceMap.put(FieldTypeEnum.TAB.getCode(), FieldTypeEnum.TAB.getSequence());
            sequenceMap.put(FieldTypeEnum.HEADING.getCode(), FieldTypeEnum.HEADING.getSequence());
        }

        /**
         * get elasticsearch index by field belong
         *
         * @param fieldBelong
         * @return
         */
        public static String getIndexName(int fieldBelong) {
            return indexMap.get(fieldBelong);
        }

        /**
         * get main table of function
         *
         * @param fieldBelong
         * @return
         */
        public static String getTableMain(int fieldBelong) {
            return tableMainMap.get(fieldBelong);
        }

        /**
         * get column data by field belong
         *
         * @param fieldBelong
         * @return
         */
        public static String getColumnData(int fieldBelong) {
            return columnDataMap.get(fieldBelong);
        }

        /**
         * get column primary by field belong
         *
         * @param fieldBelong
         * @return
         */
        public static String getColumnPrimary(int fieldBelong) {
            return columnPKMap.get(fieldBelong);
        }

        /**
         * get field type prefix
         *
         * @param fieldType
         * @return
         */
        public static String getFieldTypePrefix(String fieldType) {
            return fieldTypeMap.get(fieldType);
        }

        /**
         * get field type sequence
         *
         * @param fieldType
         * @return
         */
        public static String getFieldTypeSequence(String fieldType) {
            return sequenceMap.get(fieldType);
        }
    }

    /**
     * Action change code
     */
    public enum ChangeAction {
        DELETE(0), INSERT(1), UPDATE(2);

        private int value;

        private ChangeAction(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * Search type
     */
    public enum SearchTypeEnum {
        LIKE(1), FIRST_MATCH(2), OTHER(3);

        private int value;

        private SearchTypeEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * Search option
     */
    public enum SearchOptionEnum {
        OR(1), AND(2), ALL_WORD(3), NOT_OR(4), NOT_AND(5);

        private int value;

        private SearchOptionEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * File extension
     */
    class FileExtension {
        private FileExtension() {
            // do nothing
        }

        String CSV = "csv";
    }

    /**
     * The roles of user
     */
    class Roles {
        private Roles() {
            // do nothing
        }

        String ROLE_ADMIN = "ROLE_ADMIN";
        String ROLE_USER = "ROLE_USER";
        String ROLE_ANONYMOUS = "ROLE_ANONYMOUS";
    }

    /**
     * The roles of user
     */
    class Authenticate {
        private Authenticate() {
            // do nothing
        }
        String TENANT_ID = "custom:tenant_id";
        String EMPLOYEE_ID = "custom:employee_id";
        String LANGUAGE_CODE = "custom:language_code";
        String EMPLOYEE_NAME = "custom:employee_name";
        String FORMAT_DATE = "custom:format_date";
        String TIMEZONE = "custom:timezone_name";
        String IS_ACCESS_CONTRACT = "custom:is_access_contract";
        String IS_MODIFY_EMPLOYEE = "custom:is_modify_employee";
        String LICENSES = "licenses";
        String EMAIL = "email";
    }

    /**
     * Constants for query
     */
    class Query {
        private Query() {
            // do nothing
        }

        String QUERY_STRING = "query";
        String SPACE = " ";
        String PARAMETERS = "paramameter";
        String CONDITIONS = "condition";
        String QUERY_SELECT = "query_select_column";
        String QUERY_JOIN = "query_join";
        String QUERY_GROUPBY = "query_groupby";
        String QUERY_ORDERBY = "query_order_by";
        String OFFSET_LIMIT = "offset_limit";
        String INDEX_PARAM = "indexParam";
        String IS_TRUE = "true";
        String IS_FALSE = "false";
        String SEARCH_LIKE = "LIKE";
        String SEARCH_LIKE_FIRST = "LIKE ";
        String SEARCH_OTHER = "<>";
        String OR_CONDITION = "OR";
        String SEARCH_OR_FLAG = "1";
        String IS_NULL = " IS NULL ";
        String EQUAL_EMPTY = " = '' ";
        String AND_CONDITION = "AND";
        String ALL_WORD = "WORD";
        String NOT_AND_CONDITION = "NOT AND";
        String NOT_OR_CONDITION = "NOT OR";
        String REGEX_FIELD_NAME = "^[^0-9][a-zA-Z0-9_\\.]+";
        String REGEX_FIELD_NAME_WITH_JSON = "^[^0-9][a-zA-Z0-9_]+(\\.[^0-9][a-zA-Z0-9_]+)+$";
        String REGEX_DOT_ESCAPED = "\\.";

        String LAMDA_OPERATOR = " ->> '";
        String QUERY_PARAMETER_INDEX = " :indexParam";

        public enum SEARCH_FIELDS {
            FIELD_TYPE, FIELD_NAME, FIELD_VALUE, SEARCH_TYPE, SEARCH_OPTION, IS_DEFAULT, FROM, TO
        }

        /**
         * define special item map to get sort column
         */
        private static Map<String, String> sortColumnMap = new HashMap<>();
        static {
            sortColumnMap.put("language_id", "language_name");
            sortColumnMap.put("timezone_id", "timezone_name");
        }

        /**
         * get column for sort
         *
         * @param key
         * @return
         */
        public static String getSortColumn(String key) {
            return sortColumnMap.get(key);
        }
    }

    /**
     * User does not have permission code
     */
    String USER_NOT_PERMISSION = "ERR_COM_0007";

    /**
     * User does not have role admin
     */
    String USER_HAVE_NOT_ROLE_ADMIN = "ERR_COM_039";

    /**
     * Product category has been registered product
     */
    String CATEGORY_REGISTERED_PRODUCT = "ERR_PRO_0003";

    /**
     * Product category has product categories children
     */
    String CATEGORY_HAS_CHILDREN = "ERR_PRO_0004";
    /**
     * 数に負の値は指定できません。
     */
    String NUMBER_NOT_NEGATIVE = "ERR_COM_0016";

    /**
     * 更新を実行する前にデータが変更されました。再度ご確認ください。
     */
    String EXCLUSIVE_CODE = "ERR_COM_0050";

    /**
     * 無効なパラメーター
     */
    String INVALID_PARAMETER = "ERR_COM_0044";

    /**
     * Save to S3 failed
     */
    String SAVE_FILE_TO_S3_FAILED = "ERR_COM_040";

    /**
     * File to S3 not exist.
     */
    String FILE_NOT_EXIST = "ERR_COM_0042";

    /**
     * Delete file to S3 failed.
     */
    String FILE_DELETE_FAILED = "ERR_COM_0041";

    /**
     * Total file size is too large
     */
    String FILE_OVER_SIZE = "ERR_COM_0033";
    /**
     * last owner
     */
    String GROUP_LAST_OWNER = "ERR_TIM_0002";

    /**
     * Total file size max. 2GB
     */
    long FILE_SIZE_MAX = 2147483648L;

    Object DECIMAL_PLACE_INVALID_CODE = "ERR_COM_0030";
    Object LINK_INVALID_CODE = "ERR_COM_0055";

    /**
     * Contain index and number of variable in file part name in form-data
     * request's variables
     */
    class PartNameSection {
        private PartNameSection() {

        }

        int NUMBER_OF_SECTION = 3;

        int ID_INDEX = 0;
        int FIELD_NAME_INDEX = 1;
        int FILE_ALIAS_INDEX = 2;

        String SECTION_SPLIT_CHAR_REGEX = "\\.";
    }

    public enum PathEnum {
        EMPLOYEES,
        MAILS,
        COMMONS,
        SCHEDULES,
        PRODUCTS,
        CUSTOMERS,
        ACTIVITIES,
        TIMELINES,
        TENANTS,
        OCRS,
        BUSINESSCARDS,
        CHATS,
        EXTERNALS,
        SALES,
        TUTORIALS,
        ANALYSIS;
    }


    int DELETED_FILE_STATUS = 1;

    String OWNER = "ERR_TIM_0001";
    /**
     * Name of micro Service employees
     */
    String MICRO_SERVICE_EMPLOYEES = "employees";

    /**
     * Name of micro Service customers
     */
    String MICRO_SERVICE_CUSTOMERS = "customers";

    /**
     * Name of micro Service business cards
     */
    String MICRO_SERVICE_BUSINESS_CARDS = "businesscards";

    /**
     * Name of micro Service products
     */
    String MICRO_SERVICE_PRODUCTS = "products";

    /**
     * Name of micro Service commons
     */
    String MICRO_SERVICE_COMMONS = "commons";

    /**
     * Name of micro Service schedules
     */
    String MICRO_SERVICE_SCHEDULES = "schedules";


    /**
     * Name of micro Service tenants
     */
    String MICRO_SERVICE_TENANTS = "tenants";

    /**
     * Name of micro Service uaa
     */
    String MICRO_SERVICE_UAA = "uaa";

    /**
     * Name of micro Service activities
     */
    String MICRO_SERVICE_ACTIVITIES = "activities";

    /**
     * Name of micro Service sales
     */
    String MICRO_SERVICE_SALES = "sales";

    /**
     * Name of micro Service timelines
     */
    String MICRO_SERVICE_TIMELINES = "timelines";

    /**
     * Service type
     */
    public enum ServiceType {
        ACTIVITIES(3);

        private int value;

        private ServiceType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * Transaction management service contants
     */
    class TMS {
        private TMS() {
            //initial only
        }

        String ACTION = "Action";
        String ACTION_START_TRANSACTION = "StartTransaction";
        String ACTION_END_TRANSACTION = "EndTransaction";
        String ACTION_EXECUTE = "Execute";
        String ACTION_REGISTER_PS = "RegisterPS";

        String PS_LIST = "PSList";
        String PS_NAME = "PSName";
        String PS_ARGS = "PSArgs";
        String PS_TEMPLATE = "PSTemplate";

        String TIMEOUT = "Timeout";
        String TRANS_ID = "TransID";
        String QUERIES = "Queries";
        String CODE = "Code";
        String EXCEPTION = "Exception";
        String REASON = "Reason";
        String MSG = "Msg";
        String CODE_SUCCESS = "1";
        String CODE_FAILED = "0";
        String CODE_INCOMPLETE = "2";

        String SINGLE_QUOTE = "'";
        String RESULTS = "Results";

        String ACTION_ROLLBACK_TRANSACTION = "RollbackTransaction";

        String TMS_SERVICE_EXCEPTION = "TmsService exception";

        String TMS_IO_EXCEPTION = "ERR_TMS_001";

        String TMS_UNEXPECTED_EXCEPTION = "ERR_TMS_999";

    }

    public enum TimelineAuto {
        EMPLOYEE(1, -1, -1, FieldBelong.EMPLOYEE.getValue()), COMPANY(2, -1, -1, -1), DEPARTMENT(3, -1, -1, -1),
        CHANNEL(4, 2, 2, -1), CUSTOMER(5, 3, 4, FieldBelong.CUSTOMER.getValue()), BUSINESS_CARD(6, 4, 5, FieldBelong.BUSINESS_CARD.getValue()),
        ACTIVITY(7, 5, 3, FieldBelong.ACTIVITY.getValue()), SCHEDULE(8, 6, 6, FieldBelong.SCHEDULE.getValue()),
        TASK(9, 7, 7, FieldBelong.TASK.getValue()), MILESTONE(10, 8, 8, FieldBelong.MILESTONE.getValue()),
        IMPORT(-1, 9, 1, -1), BATCH(1, 10, 9, -1);
        private Integer targetType;
        private Integer createPosition;
        private Integer timelineType;
        private Integer headerType;

        private TimelineAuto(Integer targetType, Integer createPosition, Integer timelineType, Integer headerType) {
            this.targetType = targetType;
            this.createPosition = createPosition;
            this.timelineType = timelineType;
            this.headerType = headerType;
        }

        public Integer getTargetType() {
            return targetType;
        }

        public Integer getCreatePosition() {
            return createPosition;
        }

        public Integer getTimelineType() {
            return timelineType;
        }
        public Integer getHeaderType() {
            return headerType;
        }

        String INVITE_ID = "inviteId";
        String INVITE_TYPE = "inviteType";
    }

    // TMS constants
    String SELECT = " SELECT ";
    String DELETE = " DELETE ";
    String FROM = " FROM ";
    String WHERE = " WHERE ";
    String LEFT_JOIN = " LEFT JOIN ";
    String INNER_JOIN = " INNER JOIN ";
    String ORDER_BY = " ORDER BY ";
    String GROUP_BY = " GROUP BY ";
    String AS = " AS ";
}
