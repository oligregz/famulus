package com.api.famulus.statusApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class StatusApiController {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @ResponseBody
  @GetMapping("/status")
  public HealthResponse healthCheck() {

    try {
      // Test database connection with a simple query
      Integer status = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
      return new HealthResponse("Api is running with database connection with status: "
        + status
      );

    } catch (Exception e) {
      return new HealthResponse("""
        Api running with status: 0, Problem: %s
        """.formatted(
          e.getMessage()
        ).replace("\n", "")
      );
    }
  }

  public static class HealthResponse {
    private String message;

    public HealthResponse(String message) {
      this.message = message;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }
}
