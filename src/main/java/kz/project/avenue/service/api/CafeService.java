package kz.project.avenue.service.api;

import kz.project.avenue.json.TableJson;

import java.util.List;

public interface CafeService {
    List<TableJson> getMyTables();

    List<TableJson> getWaitingTables();
}
