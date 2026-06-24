from sqlalchemy import Column, String
from database.database import Base

class ChatHistory(Base):

    __tablename__ = "chat_history"

    id=Column(String, primary_key=True)
    user_id=Column(String)
    message=Column(String)