CREATE TABLE lumma.documents (

    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    chat_id UUID,
    file_name VARCHAR(255) NOT NULL,
    original_name VARCHAR(255) NOT NULL,
    mime_type VARCHAR(100),
    size BIGINT,
    bucket VARCHAR(100),
    object_name VARCHAR(255),
    created_at TIMESTAMP NOT NULL,

    CONSTRAINT fk_document_user
        FOREIGN KEY (user_id)
        REFERENCES lumma.users(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_document_chat
        FOREIGN KEY (chat_id)
        REFERENCES lumma.chats(id)
        ON DELETE SET NULL

);