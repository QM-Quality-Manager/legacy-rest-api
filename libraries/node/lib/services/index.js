const AuthenticationService = require('./authentication_service');
const DepartmentService = require('./department_service');
const LocalizationService = require('./localization_service');
const UserService = require('./user_service');
const FormService = require('./form_list_service');
const CategoryService = require('./category_service');
const PriorityService = require('./priority_service');
const AssetService = require('./asset_service');

module.exports = {
  AuthenticationService, DepartmentService,
  LocalizationService, UserService, FormService,
  CategoryService, PriorityService, AssetService
}