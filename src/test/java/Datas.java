public class Datas {

  //ALTER TABLE mytest.instance AUTO_INCREMENT = 1;
  // serial in postgre

  static String deleteRoles="truncate table roles RESTART IDENTITY cascade";
  static String insertRoles ="insert into roles(insert_date_time, insert_user_id, is_deleted, last_update_date_time,last_update_user_id, description)" +
        " values('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'Root User'), ('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'Admin'), ('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'Manager'), ('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'Employee')";

  static String deleteUsers="delete from users";
  static String insertUsers =
  "insert into users(insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id, username, password, firstname, lastname, phone, role_id, company_id, enabled) "+
  "values('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1,'root@cydeo.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK','Robert', 'Martin', '+1 (852) 564-5874', 1, 1, true), "+
          "('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1,'admin@greentech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK','Mary', 'Grant', '+1 (234) 345-4362', 2, 2, true), " +
          "('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'admin2@greentech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Garrison', 'Short', '+1 (234) 356-7865', 2, 2, true), "+
          " ('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'manager@greentech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Robert', 'Noah', '+1 (234) 564-5874', 3, 2, true), " +
          " ('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'employee@greentech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Mike', 'Times', '+1 (234) 741-8569', 4, 2, true), " +
          "('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'admin@bluetech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Chris', 'Brown', '+1 (356) 258-3544', 2, 3, true), " +
          "('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'manager@bluetech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Tom', 'Hanks', '+1 (356) 258-3544', 3, 3, true), " +
          "('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'employee@bluetech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Mike', 'Smith', '+1 (356) 258-3544', 4, 3, true), " +
          "('2022-09-09 00:00:00', 1, false, '2022-09-09 00:00:00', 1, 'admin@redtech.com', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'John', 'Doe', '+1 (659) 756-1265', 2, 4, true);";



}
