package fancyTseRemoteController;

import fancyTseRemoteController.callback.TransportCallback;
import fancyTseRemoteController.models.TransportReturn;
import fancyTseRemoteController.models.TseClient;
import fancyTseRemoteController.models.TseTransaction;

public interface Transport {

    TseTransaction transport(TseTransaction transaction, TseClient tseClient);

    TransportReturn transport(TransportCallback callback);

}

