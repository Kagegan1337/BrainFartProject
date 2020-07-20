package fancyTseRemoteController;

import fancyTseRemoteController.callback.TransportCallback;
import fancyTseRemoteController.models.TransportReturn;
import fancyTseRemoteController.models.TseClient;
import fancyTseRemoteController.models.TseTransaction;

public class RemoteController implements Transport{

    @Override
    public TseTransaction transport(TseTransaction transaction, TseClient tseClient) {
        return null;
    }

    @Override
    public TransportReturn transport(TransportCallback callback) {
        return callback.doUrJob();
    }
}
