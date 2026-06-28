CREATE TABLE lumma.user_roles (
    user_id UUID NOT NULL,
    role_id UUID NOT NULL,
    PRIMARY KEY(user_id, role_id),
    CONSTRAINT fk_user
        FOREIGN KEY(user_id)
        REFERENCES lumma.users(id),

    CONSTRAINT fk_role
        FOREIGN KEY(role_id)
        REFERENCES lumma.roles(id)
);