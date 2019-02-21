
<h3 class="chapter-number">09</h3>
### Application profiles

##### YAML Configuration

Use the "---" YAML document delimiter to specify multiple application profiles

```yaml
### Common configuration ###
spring.profiles.active: prod
request.timeout: 1000

---
### Specific production profile configuration ###
spring.profiles: prod
request.timeout: ${GLOBAL_REQUEST_TIMEOUT:100}

---
### Specific development profile configuration ###
spring.profiles: dev
request.timeout: 5000
```

Note:
- Explain advantages for local development
- Show an example in code