package io.quarkiverse.aap.api.client.ansible.automation.platform.deployment;

import io.quarkiverse.aap.api.client.ansible.automation.platform.runtime.AAPClient;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class AnsibleAutomationPlatformApiClientProcessor {

    private static final String FEATURE = "ansible-automation-platform-api-client";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public void produceClasses(BuildProducer<AdditionalBeanBuildItem> additionalBeanBuildItemBuildProducer) {
        additionalBeanBuildItemBuildProducer.produce(AdditionalBeanBuildItem.unremovableOf(AAPClient.class));
    }
}
