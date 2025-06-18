package com.projects.Spring.Boot.Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return """
                <html>
                    <head>
                        <style>
                            body {
                                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                                background: linear-gradient(to right, #2193b0, #6dd5ed);
                                color: #ffffff;
                                text-align: center;
                                padding-top: 100px;
                                margin: 0;
                            }
                            h1 {
                                font-size: 50px;
                                margin-bottom: 20px;
                            }
                            p {
                                font-size: 22px;
                                margin: 8px 0;
                            }
                            .footer {
                                font-size: 16px;
                                margin-top: 50px;
                                opacity: 0.8;
                            }
                            .highlight {
                                font-weight: bold;
                                color: #ffe082;
                            }
                        </style>
                    </head>
                    <body>
                        <h1>Hello from Spring Boot 👋</h1>
                        <p>This application is successfully deployed</p>
                        <p class="highlight">via Kubernetes + Argo CD 🚀</p>
                        <div class="footer">— Powered by Thejana Ravindu -</div>
                    </body>
                </html>
                """;
    }
}
