DROP SEQUENCE IF EXISTS "user_group_sequence_generator";
CREATE SEQUENCE "user_group_sequence_generator"
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

DROP TABLE IF EXISTS "user_groups";
CREATE TABLE "user_groups" (
    "id" int8 NOT NULL PRIMARY KEY,
    "member_group_id" int8,
    "user_id " int8,
    "created_by" int8,
    "created_at" timestamp,
    "updated_by" int8,
    "updated_at" timestamp,
    "deleted_by" int8,
    "deleted_at" timestamp
);

ALTER TABLE "member_groups" DROP IF EXISTS "list_user_info_id";

ALTER TABLE "members" ADD COLUMN IF NOT EXISTS "auth_code" varchar(255);

ALTER TABLE "exams" ADD COLUMN IF NOT EXISTS "is_lock" boolean;
