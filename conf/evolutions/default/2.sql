
# --- !Ups

insert into t_user values(
1,
'firstUser',+
2,
192,
'バナナ',
CURRENT_TIMESTAMP(),
CURRENT_TIMESTAMP()
),
(
2,
'secondUser',
3,
168,
'ケーキ',
CURRENT_TIMESTAMP(),
CURRENT_TIMESTAMP()
);

# --- !Downs

delete from t_user