package taeniverse.unicatApi.cache.claims;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import taeniverse.unicatApi.cache.claims.impl.LocalClaimsCache;

@Configuration
public class ClaimsCacheConfig {

    @Bean
    public ClaimsCache localClaimsCache() {
        return new LocalClaimsCache();
    }
}
