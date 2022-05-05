package com.EvreteTransaction.EvreteTransaction;

import org.evrete.KnowledgeService;
import org.evrete.api.Knowledge;
import org.evrete.api.StatefulSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class TransactionService {

    @Autowired
    private Commission commission;

    public Commission calculateCommission(Transaction transaction) throws IOException {

        StatefulSession session = getStatefulSession("src/main/resources/Rules/TransactionRules.java");
        session.insert(transaction, commission);
        session.fire();
        return commission;

    }

    private StatefulSession getStatefulSession(String path) throws IOException {
        KnowledgeService service = new KnowledgeService();
        File f = new File(path);
        URL fileUrl = f.toURI().toURL();
        Knowledge knowledge = service.newKnowledge(
                "JAVA-SOURCE",
                fileUrl
        );

        StatefulSession session = knowledge.newStatefulSession();
        return session;
    }

}
