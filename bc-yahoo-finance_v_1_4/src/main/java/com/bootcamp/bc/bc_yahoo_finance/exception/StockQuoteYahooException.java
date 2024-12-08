package com.bootcamp.bc.bc_yahoo_finance.exception;

import com.bootcamp.bc.bc_yahoo_finance.infra.web.BusinessException;
import com.bootcamp.bc.bc_yahoo_finance.infra.web.ErrorCode;
import com.bootcamp.bc.bc_yahoo_finance.model.dto.YahooQuoteErrorDTO;

public class StockQuoteYahooException extends BusinessException {
  public StockQuoteYahooException(YahooQuoteErrorDTO quoteErrorDTO) {
    super(ErrorCode.REST_CLIENT_EX,
        quoteErrorDTO.getBody().getError().getMessage());
  }
}
