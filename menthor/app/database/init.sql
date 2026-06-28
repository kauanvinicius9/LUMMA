CREATE SCHEMA IF NOT EXISTS menthor;

CREATE TABLE menthor.models (
    id UUID PRIMARY KEY,
    provider VARCHAR(50),
    model_name VARCHAR(100),
    temperature NUMERIC(3,2),
    max_tokens INTEGER
);

CREATE TABLE menthor.memory (
    id UUID PRIMARY KEY,
    session_id UUID,
    role VARCHAR(20),
    content TEXT,
    created_at TIMESTAMP
);