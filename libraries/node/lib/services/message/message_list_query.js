class MessageListQuery{
  userLanguageId;                     // Int
  companyLanguageId;                  // Int
  messageId;                          // Int
  fromDate;                           // Long (Date)
  toDate;                             // Long (Date)
  textSearchString;                   // String
  fromDepNr;                          // Int
  formId;                             // Int
  categoryIdList;                     // List<Integer>
  priority;                           // Int
  statusList;                         // List<Integer>
  messageType;                        // Int (FAULT 1, LIST - COMMENT 2, LOG 3, RISK 4, REPORT 5)
}

module.exports = MessageListQuery;