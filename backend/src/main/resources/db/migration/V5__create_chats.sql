CREATE TABLE lumma.chats (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    title VARCHAR(255),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,

    CONSTRAINT fk_chat_user
        FOREIGN KEY (user_id)
        REFERENCES lumma.users(id)
        ON DELETE CASCADE
);