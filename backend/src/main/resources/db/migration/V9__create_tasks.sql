CREATE TABLE lumma.tasks (

    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    chat_id UUID,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(20) NOT NULL DEFAULT 'PENDING',
    priority VARCHAR(20) NOT NULL DEFAULT 'MEDIUM',
    due_date TIMESTAMP,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,

    CONSTRAINT fk_task_user
        FOREIGN KEY (user_id)
        REFERENCES lumma.users(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_task_chat
        FOREIGN KEY (chat_id)
        REFERENCES lumma.chats(id)
        ON DELETE SET NULL

);