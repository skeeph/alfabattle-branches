package io.khabib.controllers;

import io.khabib.api.BranchesApi;
import io.khabib.api.NotFoundException;
import io.khabib.model.Branches;
import io.khabib.model.BranchesWithPredicting;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.khabib.services.BranchesService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T10:55:57.660Z")

@Controller
public class BranchesApiController implements BranchesApi {

    private static final Logger log = LoggerFactory.getLogger(BranchesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private final BranchesService branchesService;

    @Autowired
    public BranchesApiController(ObjectMapper objectMapper, HttpServletRequest request, BranchesService branchesService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.branchesService = branchesService;
    }

    public ResponseEntity<Branches> getBranchUsingGET(@ApiParam(value = "id", required = true) @PathVariable("id") Long id) throws NotFoundException {
        return branchesService.getBranch(id).map(x -> new ResponseEntity<Branches>(x, HttpStatus.OK))
                .orElseThrow(() -> new NotFoundException(404, "branch not found"));
    }

    public ResponseEntity<BranchesWithPredicting> getBranchesWithPredictingUsingGET(@NotNull @ApiParam(value = "dayOgWeek", required = true) @Valid @RequestParam(value = "dayOgWeek", required = true) Integer dayOgWeek, @NotNull @ApiParam(value = "hourOfDay", required = true) @Valid @RequestParam(value = "hourOfDay", required = true) Integer hourOfDay, @ApiParam(value = "id", required = true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BranchesWithPredicting>(objectMapper.readValue("{  \"address\" : \"address\",  \"dayOfWeek\" : 0,  \"hourOfDay\" : 6,  \"lon\" : 5.637376656633329,  \"id\" : 1,  \"title\" : \"title\",  \"lat\" : 5.962133916683182,  \"predicting\" : 2}", BranchesWithPredicting.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BranchesWithPredicting>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BranchesWithPredicting>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Branches> getNearBranchUsingGET(
            @NotNull @ApiParam(value = "lat", required = true) @Valid @RequestParam(value = "lat", required = true) Double lat,
            @NotNull @ApiParam(value = "lon", required = true) @Valid @RequestParam(value = "lon", required = true) Double lon) throws NotFoundException {
        return branchesService.getNearest(lat, lon).map(x -> new ResponseEntity<Branches>(x, HttpStatus.OK))
                .orElseThrow(() -> new NotFoundException(404, "branch not found"));
    }

}
