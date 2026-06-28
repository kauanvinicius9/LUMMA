CREATE TABLE lumma.messages (

    id UUID PRIMARY KEY,
    chat_id UUID NOT NULL,
    role VARCHAR(20) NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL,

    CONSTRAINT fk_message_chat
        FOREIGN KEY (chat_id)
        REFERENCES lumma.chats(id)
        ON DELETE CASCADE

);