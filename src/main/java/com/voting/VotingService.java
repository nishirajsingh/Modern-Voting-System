package com.voting;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class VotingService {
    private List<Candidate> candidates = new ArrayList<>();
    private List<Voter> voters = new ArrayList<>();
    private int voterIdCounter = 101;

    public VotingService() {
        candidates.add(new Candidate("Narendra Modi", "🪷 BJP"));
        candidates.add(new Candidate("Rahul Gandhi", "✋ INC"));
        candidates.add(new Candidate("Mamta Banarjee", "🌱 TMC"));
        candidates.add(new Candidate("Arvind Kejriwal", "🧹 AAP"));
        candidates.add(new Candidate("Akhilesh Yadav", "🚲 SP"));
        candidates.add(new Candidate("Mayawati", "🐘 BSP"));
    }

    public String registerVoter(String name, String aadhaar, String address) {
        if (voters.stream().anyMatch(v -> v.getAadhaar().equals(aadhaar))) {
            return "Aadhaar already registered!";
        }
        String voterId = "NGF" + voterIdCounter++;
        voters.add(new Voter(voterId, name, aadhaar, address));
        return "Voter registered successfully! Voter ID: " + voterId;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public String castVote(String voterId, int candidateIndex) {
        Voter voter = voters.stream().filter(v -> v.getVoterId().equals(voterId)).findFirst().orElse(null);
        
        if (voter == null) return "Invalid Voter ID!";
        if (voter.hasVoted()) return "You have already voted!";
        if (candidateIndex < 0 || candidateIndex >= candidates.size()) return "Invalid candidate!";

        candidates.get(candidateIndex).addVote();
        voter.setVoted();
        return "Vote cast successfully for " + candidates.get(candidateIndex).getName();
    }

    public List<Candidate> getResults() {
        return candidates;
    }
}