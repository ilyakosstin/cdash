План структур:

Пользователь (User):

1. id
2. username
3. password
4. created_at
5. updated_at
6. balance

TextFragment

1. id
2. header
3. body
4. created_at
5. updated_at

DocumentNode

1. (document_id, fragment_id)
2. position

Document

1. id
2. title
3. created_at
4. updated_at

Task

1. id
2. title
3. description
4. status (NONE | CANCELLED | COMPLETED)
5. deadline
6. created_at
7. updated_at
8. closed_at
9. parent_list_id

TaskList

1. id
2. title
3. description
4. parent_list_id

Event

5. updated_at
1. id
1. title
1. description
1. begins_at
1. ends_at
1. status (NONE | CANCELLED | COMPLETED)
1. task_list_id
1. created_at
1. updated_at
1. closed_at
