package com.projettransversal.api.Controllers;

import com.projettransversal.api.Models.Incident;
import com.projettransversal.api.Models.Truck;
import com.projettransversal.api.Models.ViewModels.IncidentViewModel;
import com.projettransversal.api.Services.IServices.IIncidentService;
import com.projettransversal.api.Services.IServices.IMapItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IncidentController {
    private final IIncidentService _incidentService;
    private final IMapItemService _mapItemService;

    public IncidentController(IIncidentService incidentService, IMapItemService mapItemService) {
        _incidentService = incidentService;
        _mapItemService = mapItemService;
    }

    @RequestMapping(value="/incidents", method= RequestMethod.GET)
    public List<Incident> getIncidents() {
        return _incidentService.findAll();
    }

    @RequestMapping(value="/incident/{id}", method= RequestMethod.GET)
    public Optional<Incident> getIncidentById(@PathVariable int id) {
        return _incidentService.findById(id);
    }

    @RequestMapping(value="/incident", method= RequestMethod.POST)
    public Incident getIncidentById(@RequestBody IncidentViewModel incidentVM) {
        return _incidentService.create(incidentVM);
    }

    @RequestMapping(value = "/incident/{incident_id}/intensity/{new_intensity}", method = RequestMethod.POST)
    public Incident updateIncident(@PathVariable int incident_id,@PathVariable int new_intensity )  {
        return this._incidentService.updateIncidentIntensity(incident_id, new_intensity );
    }

}
