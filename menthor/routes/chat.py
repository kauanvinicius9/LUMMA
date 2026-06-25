from fastapi import APIRouter

from schemas.chat import (
    ChatRequest,
    ChatResponse
)

from services.llama_service import (
    LlamaService
)

router=APIRouter(
    prefix="/chat",
    tags=["Chat"]
)

@router.post(
    "",
    response_model=ChatResponse
)
async def chat(request: ChatRequest):
    response=LlamaService.ask(
        request.message
    )

    return ChatResponse(
        response=response
    )
