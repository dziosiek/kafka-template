//package com.example.kafkatemplate;
//
//import org.apache.kafka.streams.KafkaStreams;
//import org.apache.kafka.streams.StoreQueryParameters;
//import org.apache.kafka.streams.state.QueryableStoreTypes;
//import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.config.StreamsBuilderFactoryBean;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class MyKafkaController {
//
//    @Autowired
//    StreamsBuilderFactoryBean factoryBean;
//
//    @GetMapping("/count/{word}")
//    public Long getWordCount(@PathVariable String word) {
//        KafkaStreams kafkaStreams = factoryBean.getKafkaStreams();
//        ReadOnlyKeyValueStore<String, Long> counts = kafkaStreams.store(
//            StoreQueryParameters.fromNameAndType("counts", QueryableStoreTypes.keyValueStore())
//        );
//        return counts.get(word);
//    }
//}
