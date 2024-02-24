package com.charlottewiltshire0.todo.api.exception

import com.fasterxml.jackson.annotation.JsonProperty

data class ErrorDto(
    val error: String?,
    @JsonProperty("error_description") val errorDescription: String?
) {
    companion object {
        @JvmStatic
        fun builder(): Builder {
            return Builder()
        }
    }

    class Builder {
        private var error: String? = null
        private var errorDescription: String? = null

        fun error(error: String?): Builder {
            this.error = error
            return this
        }

        fun errorDescription(errorDescription: String?): Builder {
            this.errorDescription = errorDescription
            return this
        }

        fun build(): ErrorDto {
            return ErrorDto(error, errorDescription)
        }
    }
}
